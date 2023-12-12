import {UserResource} from "./user.resource";

export class DocumentChangeHistoryResource {
  private readonly _modificationDate: Date;
  private readonly _requester: UserResource;

  constructor(modificationDate: Date, requester: UserResource) {
    this._modificationDate = modificationDate;
    this._requester = requester;
  }

  get modificationDate(): Date {
    return this._modificationDate;
  }

  get requester(): UserResource {
    return this._requester;
  }
}
