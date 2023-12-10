import {ChangeDetectionStrategy, Component, Input} from '@angular/core';
import {Observable} from "rxjs";
import {Documents} from "../../../documents";

@Component({
  selector: 'app-document-table',
  templateUrl: './document-table.component.html',
  styleUrls: ['./document-table.component.scss'],
  changeDetection: ChangeDetectionStrategy.OnPush,
})
export class DocumentTableComponent {
  @Input() documents!: Observable<Documents[]>;
  @Input() displayedColumns!: string[];
}
