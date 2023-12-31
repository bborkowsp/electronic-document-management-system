import {Component} from '@angular/core';

@Component({
  selector: 'app-search-document',
  templateUrl: './search-document.component.html',
  styleUrls: ['./search-document.component.scss']
})
export class SearchDocumentComponent {
  searchQuery: {
    documentId?: string;
    company?: string;
    supplier?: string;
    recipient?: string;
    documentNumber?: string;
    status?: string;
    netAmount?: string;
    grossAmount?: string;
    saleDateFrom?: string;
    saleDateTo?: string;
  } = {};

  search() {
    // Tutaj dodaj logikę wyszukiwania, na przykład wywołaj odpowiednią usługę.
    console.log('Wyszukaj:', this.searchQuery);
  }
}
