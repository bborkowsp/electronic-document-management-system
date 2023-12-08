import {NgModule} from '@angular/core';
import {NavbarComponent} from './navbar.component';
import {RouterLink} from "@angular/router";

@NgModule({
  declarations: [NavbarComponent],
  exports: [NavbarComponent],
  imports: [
    RouterLink
  ]
})
export class NavbarModule {
}
