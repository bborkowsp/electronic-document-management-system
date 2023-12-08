import {ChangeDetectionStrategy, Component, Input} from '@angular/core';

@Component({
  selector: 'app-paginator',
  templateUrl: './paginator.component.html',
  styleUrls: ['./paginator.component.scss'],
  changeDetection: ChangeDetectionStrategy.OnPush,
})
export class PaginatorComponent {
  @Input() length!: number;
  @Input() pageSize!: number;
  @Input() pageSizeOptions!: number[];
}

