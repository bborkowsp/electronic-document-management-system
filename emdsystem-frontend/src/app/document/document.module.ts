import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {MatPaginatorModule} from "@angular/material/paginator";
import {MatMenuModule} from "@angular/material/menu";
import {MatIconModule} from "@angular/material/icon";
import {MatTableModule} from "@angular/material/table";

import {DocumentTableComponent} from './components/document-list/document-table/document-table.component';
import {PaginatorComponent} from './components/document-list/paginator/paginator.component';
import {DocumentListComponent} from './components/document-list/document-list.component';
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {BrowserAnimationsModule} from "@angular/platform-browser/animations";
import {HttpClientModule} from "@angular/common/http";
import {MatButtonModule} from "@angular/material/button";
import {MatFormFieldModule} from "@angular/material/form-field";
import {MatInputModule} from "@angular/material/input";
import {MatSelectModule} from "@angular/material/select";
import {MatToolbarModule} from "@angular/material/toolbar";
import {MatDialogModule} from "@angular/material/dialog";


function SharedModule() {

}

@NgModule({
  declarations: [
    DocumentTableComponent,
    PaginatorComponent,
    DocumentListComponent
  ],
  imports: [
    CommonModule,
    MatPaginatorModule,
    MatMenuModule,
    MatIconModule,
    MatTableModule,
    CommonModule,
    FormsModule,
    ReactiveFormsModule,
    BrowserAnimationsModule,
    HttpClientModule,
    MatTableModule,
    MatButtonModule,
    MatFormFieldModule,
    MatInputModule,
    MatSelectModule,
    MatToolbarModule,
    MatIconModule,
    MatDialogModule,
    MatPaginatorModule,
    MatMenuModule,
  ]
})
export class DocumentModule {
}
