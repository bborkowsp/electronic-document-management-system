import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {HomeComponent} from "./home/home.component";
import {DocumentListComponent} from "./document/components/document-list/document-list.component";
import {ImportScanComponent} from "./import-scan/import-scan.component";
import {SearchDocumentComponent} from "./search-document/search-document.component";

const routes: Routes = [
  {path: '', redirectTo: 'home', pathMatch: 'full'},
  {path: 'home', component: HomeComponent},
  {path: 'document-list', component: DocumentListComponent},
  {path: 'import-scan', component: ImportScanComponent},
  {path: 'search-document', component: SearchDocumentComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
