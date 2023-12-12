import {PropertyResource} from "./property.resource";

export class CompanyResource {
  _name: string;
  private readonly _properties: PropertyResource[];

  constructor(name: string, properties: PropertyResource[]) {
    this._name = name;
    this._properties = properties;
  }

  get name(): string {
    return this._name;
  }

  set name(value: string) {
    this._name = value;
  }
}
