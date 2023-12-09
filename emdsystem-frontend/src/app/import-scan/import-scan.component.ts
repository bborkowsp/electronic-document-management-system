import {Component} from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-import-scan',
  templateUrl: './import-scan.component.html',
  styleUrls: ['./import-scan.component.scss']
})
export class ImportScanComponent {
  fileNames: string[] = [];
  selectedFiles: File[] = [];

  constructor(private http: HttpClient) {
  }

  onFilesSelected(event: Event) {
    const inputElement = event.target as HTMLInputElement;

    if (inputElement.files && inputElement.files.length > 0) {
      this.selectedFiles = Array.from(inputElement.files);
      this.fileNames = this.selectedFiles.map(file => file.name);
    }
  }

  onFileDropped(event: any) {
    const files = event.dataTransfer.files;

    if (files.length > 0) {
      this.selectedFiles = Array.from(files);
      this.fileNames = this.selectedFiles.map(file => file.name);
    }
  }

  uploadFiles() {
    if (this.selectedFiles.length > 0) {
      const formData = new FormData();
      this.selectedFiles.forEach(file => {
        formData.append('files', file);
      });

      // Example: Upload to the server using HttpClient
      // const upload$ = this.http.post("/api/upload", formData);

      // upload$.subscribe(response => {
      //   // Handle the server response
      // });

      // Reload the page after uploading files
      window.location.reload();
    }
  }

  // Prevent default drag behaviors
  onDragOver(event: any) {
    event.preventDefault();
    event.stopPropagation();
  }

  // Handle drop event
  onDrop(event: any) {
    event.preventDefault();
    event.stopPropagation();
    this.onFileDropped(event);
  }
}
