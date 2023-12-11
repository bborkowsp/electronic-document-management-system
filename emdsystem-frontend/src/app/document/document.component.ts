import {Component, OnInit} from '@angular/core';
import {Observable} from "rxjs";

@Component({
  selector: 'app-document',
  templateUrl: './document.component.html',
  styleUrls: ['./document.component.scss']
})
export class DocumentComponent implements OnInit {
  private static readonly ID_PARAM_KEY = 'id';
  document$: Observable<DocumentResource> | null = null;


  ngOnInit(): void {
    this.getDocument();
  }


  private getDocument() {
    this.recipe$ = this.activatedRoute.paramMap.pipe(
      map((paramMap) => parseInt(paramMap.get(RecipeComponent.ID_PARAM_KEY)!)),
      tap((id) => (this.recipeId = id)),
      switchMap((id) => this.recipeService.getRecipe(id)),
    );
  }
}
