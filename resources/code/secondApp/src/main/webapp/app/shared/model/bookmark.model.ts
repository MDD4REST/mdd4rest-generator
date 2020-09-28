import { ITag } from 'app/shared/model/tag.model';

export const enum VisibilityType {
  PUBLIC = 'PUBLIC',
  PRIVATE = 'PRIVATE'
}

export interface IBookmark {
  id?: number;
  bookmarkName?: string;
  bookmarkUrl?: string;
  visibility?: VisibilityType;
  tag?: ITag;
}

export class Bookmark implements IBookmark {
  constructor(
    public id?: number,
    public bookmarkName?: string,
    public bookmarkUrl?: string,
    public visibility?: VisibilityType,
    public tag?: ITag
  ) {}
}
