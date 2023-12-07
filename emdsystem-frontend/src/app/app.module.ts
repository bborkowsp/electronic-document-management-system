import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {HomeComponent} from './home/home.component';
import {DocumentsComponent} from './documents/documents.component';
import {FooterComponent} from './documents/footer/footer.component';
import {MenubarModule} from "./scaffold/menubar/menubar.module";

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    DocumentsComponent,
    FooterComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    MenubarModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
