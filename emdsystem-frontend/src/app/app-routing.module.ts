import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {HomeComponent} from "./home/home.component";
import {ImportScanComponent} from "./import-scan/import-scan.component";
import {SearchDocumentComponent} from "./search-document/search-document.component";
import {DocumentListComponent} from "./documents/components/document-list/document-list.component";
import {DocumentComponent} from "./document/document.component";

const routes: Routes = [
  {path: '', redirectTo: 'home', pathMatch: 'full'},
  {path: 'home', component: HomeComponent},
  {path: 'document-list', component: DocumentListComponent},
  {path: 'import-scan', component: ImportScanComponent},
  {path: 'search-document', component: SearchDocumentComponent},
  {path: 'documents/:id', component: DocumentComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
