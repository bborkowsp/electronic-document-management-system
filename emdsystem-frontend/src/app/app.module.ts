import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {HomeComponent} from './home/home.component';
import {NavbarModule} from "./scaffold/menubar/navbar.module";
import {HttpClientModule} from "@angular/common/http";
import {NgIf} from "@angular/common";
import {MatInputModule} from "@angular/material/input";
import {MatIconModule} from "@angular/material/icon";
import {MatToolbarModule} from "@angular/material/toolbar";
import {MatFormFieldModule} from "@angular/material/form-field";
import {MatButtonModule} from "@angular/material/button";
import {ImportScanComponent} from './import-scan/import-scan.component';
import {SearchDocumentComponent} from './search-document/search-document.component';
import {FormsModule} from "@angular/forms";
import {DocumentsModule} from "./documents/documents.module";
import {DocumentComponent} from './document/document.component';
import {PdfViewerModule} from "ng2-pdf-viewer";
import {NgxExtendedPdfViewerModule} from "ngx-extended-pdf-viewer";

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    ImportScanComponent,
    SearchDocumentComponent,
    DocumentComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NavbarModule,
    HttpClientModule,
    NgIf,
    MatInputModule,
    MatFormFieldModule,
    MatButtonModule,
    MatInputModule,
    MatToolbarModule,
    MatIconModule,
    DocumentsModule,
    FormsModule,
    PdfViewerModule,
    NgxExtendedPdfViewerModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
