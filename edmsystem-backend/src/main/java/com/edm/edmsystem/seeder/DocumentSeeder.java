package com.edm.edmsystem.seeder;

import com.edm.edmsystem.model.*;
import com.edm.edmsystem.repository.DocumentRepository;
import com.github.javafaker.Faker;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.ZoneId;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

@Component
@RequiredArgsConstructor
class DocumentSeeder implements Seeder {
    private final DocumentRepository documentRepository;
    private final Faker faker;

    @Override
    public void seed(int objectsToSeed) {
        final Set<Document> documents = new HashSet<>();
        while (documents.size() < objectsToSeed) {
            final var document = createDocument();
            if (!documents.contains(document)) {
                documentRepository.save(document);
                documents.add(document);
            }
        }
    }

    private Document createDocument() {

        final var supplierCompany = createSupplierCompany();
        final var recipientCompany = createSupplierCompany();
        final var documentChangeHistory = createDocumentChangeHistory();
        final var payment = createPayment();


        return Document.builder()
                .documentType(DocumentType.INVOICE)
                .documentStatus(DocumentStatus.EDITED)
                .documentNumber(String.valueOf(faker.number().numberBetween(1, 1000)))
                .correctedInvoiceNumber(String.valueOf(faker.number().numberBetween(1, 1000)))
                .documentDescription(faker.lorem().sentence())
                .receiptDate(faker.date().past(1, TimeUnit.DAYS).toInstant().atZone(ZoneId.systemDefault()).toLocalDate())
                .saleDate(faker.date().past(1, TimeUnit.DAYS).toInstant().atZone(ZoneId.systemDefault()).toLocalDate())
                .issueDate(faker.date().past(1, TimeUnit.DAYS).toInstant().atZone(ZoneId.systemDefault()).toLocalDate())
                .splitPayment(faker.bool().bool())
                .isElectronicDocument(faker.bool().bool())
                .supplierCompany(supplierCompany)
                .recipientCompany(recipientCompany)
                .property(Property.builder()
                        .name(faker.lorem().word())
                        .build())
                .documentChangeHistory(documentChangeHistory)
                .payment(payment)
                .build();
    }

    private Payment createPayment() {
        return Payment.builder()
                .bankAccountNumber(faker.finance().iban())
                .exchangeRate(faker.number().randomDouble(2, 1, 5))
                .grossAmount(faker.number().randomDouble(2, 1, 1000))
                .netAmount(faker.number().randomDouble(2, 1, 1000))
                .vatAmount(faker.number().randomDouble(2, 1, 1000))
                .vatRate(faker.number().randomDouble(2, 1, 1000))
                .dueDate(faker.date().past(1, TimeUnit.DAYS).toInstant().atZone(ZoneId.systemDefault()).toLocalDate())
                .currency(Currency.PLN)
                .build();
    }

    private List<DocumentHistory> createDocumentChangeHistory() {
        return List.of(DocumentHistory.builder()
                .modificationDate(faker.date().past(1, TimeUnit.DAYS).toInstant().atZone(ZoneId.systemDefault()).toLocalDate())
                .requester(User.builder()
                        .firstName(faker.name().firstName())
                        .lastName(faker.name().lastName())
                        .build())
                .approver(PropertyManager.builder()
                        .firstName(faker.name().firstName())
                        .lastName(faker.name().lastName())
                        .managedProperties(Set.of(Property.builder()
                                .name(faker.lorem().word())
                                .build()))
                        .build())
                .modificationType(DocumentStatus.ACCEPTED)
                .build());
    }

    private Company createSupplierCompany() {
        Set<Property> properties = createProperties();
        return Company.builder()
                .name(faker.company().name())
                .properties(properties)
                .build();
    }

    private Set<Property> createProperties() {
        Set<Property> properties = new HashSet<>();
        properties.add(Property.builder()
                .name(faker.lorem().word())
                .build());
        return properties;
    }


}
