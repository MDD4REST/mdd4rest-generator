export interface ITag {
  id?: number;
  tagText?: string;
}

export class Tag implements ITag {
  constructor(public id?: number, public tagText?: string) {}
}
