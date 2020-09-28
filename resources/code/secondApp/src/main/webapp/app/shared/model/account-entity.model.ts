import { IBookmark } from 'app/shared/model/bookmark.model';

export interface IAccountEntity {
  id?: number;
  username?: string;
  password?: string;
  bookmark?: IBookmark;
}

export class AccountEntity implements IAccountEntity {
  constructor(public id?: number, public username?: string, public password?: string, public bookmark?: IBookmark) {}
}
