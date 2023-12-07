import {NgModule} from '@angular/core';
import {MenubarComponent} from './menubar.component';
import {RouterLink} from "@angular/router";

@NgModule({
  declarations: [MenubarComponent],
  exports: [MenubarComponent],
  imports: [
    RouterLink
  ]
})
export class MenubarModule {
}
