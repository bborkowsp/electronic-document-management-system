import {PropertyResource} from "./property.resource";

export class CompanyResource {
  private readonly _name: string;
  private readonly _properties: PropertyResource[];

  constructor(name: string, properties: PropertyResource[]) {
    this._name = name;
    this._properties = properties;
  }
}
