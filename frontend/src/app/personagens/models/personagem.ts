import {Classe} from './classe'
import {Raca} from './raca'

export interface Personagem {
  id?: number;
  nome: string;
  racaName: string;
  classeName: string;
  nivel: number;
  exp: number;
  gold: number;
  forca: number;
  inteligencia: number;
  constituicao: number;
  sabedoria: number;
  carisma: number;
  destreza: number;
  raca?: Raca['_id'];
  classe?: Classe['_id'];

}
