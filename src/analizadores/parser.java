
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package analizadores;

import java_cup.runtime.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\033\000\002\002\004\000\002\002\004\000\002\003" +
    "\004\000\002\003\004\000\002\003\004\000\002\004\011" +
    "\000\002\010\004\000\002\010\003\000\002\010\003\000" +
    "\002\010\003\000\002\010\003\000\002\007\004\000\002" +
    "\007\004\000\002\007\003\000\002\011\007\000\002\005" +
    "\005\000\002\005\003\000\002\005\004\000\002\005\004" +
    "\000\002\005\005\000\002\005\005\000\002\005\004\000" +
    "\002\005\004\000\002\005\004\000\002\006\007\000\002" +
    "\006\003\000\002\013\006" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\076\000\004\004\004\001\002\000\010\020\015\023" +
    "\011\026\013\001\002\000\004\002\006\001\002\000\004" +
    "\002\001\001\002\000\010\020\015\023\011\026\013\001" +
    "\002\000\006\005\071\026\073\001\002\000\004\023\066" +
    "\001\002\000\004\002\000\001\002\000\004\021\037\001" +
    "\002\000\010\020\015\023\011\026\013\001\002\000\004" +
    "\006\016\001\002\000\004\026\017\001\002\000\004\021" +
    "\020\001\002\000\004\022\021\001\002\000\014\025\026" +
    "\027\023\030\025\031\027\033\024\001\002\000\004\007" +
    "\035\001\002\000\004\007\ufff8\001\002\000\004\007\ufff7" +
    "\001\002\000\004\007\ufffa\001\002\000\006\011\030\025" +
    "\032\001\002\000\004\007\ufff9\001\002\000\006\011\030" +
    "\025\032\001\002\000\004\007\ufffb\001\002\000\010\007" +
    "\ufff4\011\030\025\032\001\002\000\004\007\ufff5\001\002" +
    "\000\004\007\ufff6\001\002\000\010\020\ufffc\023\ufffc\026" +
    "\ufffc\001\002\000\004\002\uffff\001\002\000\004\022\040" +
    "\001\002\000\022\004\047\010\044\012\046\013\041\016" +
    "\051\017\045\024\043\032\042\001\002\000\022\004\047" +
    "\010\044\012\046\013\041\016\051\017\045\024\043\032" +
    "\042\001\002\000\024\004\ufff1\007\ufff1\010\ufff1\012\ufff1" +
    "\013\ufff1\016\ufff1\017\ufff1\024\ufff1\032\ufff1\001\002\000" +
    "\006\015\063\025\062\001\002\000\022\004\047\010\044" +
    "\012\046\013\041\016\051\017\045\024\043\032\042\001" +
    "\002\000\022\004\047\010\044\012\046\013\041\016\051" +
    "\017\045\024\043\032\042\001\002\000\022\004\047\010" +
    "\044\012\046\013\041\016\051\017\045\024\043\032\042" +
    "\001\002\000\004\026\054\001\002\000\004\007\053\001" +
    "\002\000\022\004\047\010\044\012\046\013\041\016\051" +
    "\017\045\024\043\032\042\001\002\000\024\004\uffeb\007" +
    "\uffeb\010\uffeb\012\uffeb\013\uffeb\016\uffeb\017\uffeb\024\uffeb" +
    "\032\uffeb\001\002\000\010\020\ufff3\023\ufff3\026\ufff3\001" +
    "\002\000\004\005\055\001\002\000\024\004\uffed\007\uffed" +
    "\010\uffed\012\uffed\013\uffed\016\uffed\017\uffed\024\uffed\032" +
    "\uffed\001\002\000\024\004\uffec\007\uffec\010\uffec\012\uffec" +
    "\013\uffec\016\uffec\017\uffec\024\uffec\032\uffec\001\002\000" +
    "\024\004\uffea\007\uffea\010\uffea\012\uffea\013\uffea\016\uffea" +
    "\017\uffea\024\uffea\032\uffea\001\002\000\022\004\047\010" +
    "\044\012\046\013\041\016\051\017\045\024\043\032\042" +
    "\001\002\000\024\004\ufff2\007\ufff2\010\ufff2\012\ufff2\013" +
    "\ufff2\016\ufff2\017\ufff2\024\ufff2\032\ufff2\001\002\000\024" +
    "\004\uffef\007\uffef\010\uffef\012\uffef\013\uffef\016\uffef\017" +
    "\uffef\024\uffef\032\uffef\001\002\000\024\004\ufff0\007\ufff0" +
    "\010\ufff0\012\ufff0\013\ufff0\016\ufff0\017\ufff0\024\ufff0\032" +
    "\ufff0\001\002\000\022\004\047\010\044\012\046\013\041" +
    "\016\051\017\045\024\043\032\042\001\002\000\024\004" +
    "\uffee\007\uffee\010\uffee\012\uffee\013\uffee\016\uffee\017\uffee" +
    "\024\uffee\032\uffee\001\002\000\004\023\067\001\002\000" +
    "\004\023\070\001\002\000\006\005\uffe7\026\uffe7\001\002" +
    "\000\004\002\uffe8\001\002\000\004\002\ufffd\001\002\000" +
    "\004\006\074\001\002\000\004\032\075\001\002\000\004" +
    "\007\076\001\002\000\006\005\071\026\073\001\002\000" +
    "\004\002\uffe9\001\002\000\004\002\ufffe\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\076\000\004\002\004\001\001\000\012\003\011\004" +
    "\013\011\006\013\007\001\001\000\002\001\001\000\002" +
    "\001\001\000\012\003\077\004\013\011\006\013\007\001" +
    "\001\000\004\006\071\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\012\003\035\004\013\011" +
    "\006\013\007\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\010\021\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\007\030\001\001\000\002\001" +
    "\001\000\004\007\033\001\001\000\002\001\001\000\004" +
    "\007\032\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\005\047\001\001\000\004\005\063\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\005\057\001\001\000\004" +
    "\005\056\001\001\000\004\005\055\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\005\051\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\005\060" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\005\064\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\006\076\001\001\000\002\001" +
    "\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    //Codigo que se le agrega al parser

    //Codigo para Errores Sintacticos
    public void syntax_error(Symbol s){ 
        System.out.println("Error SintÃ¡ctico en la LÃ­nea " + (s.left) +
        " Columna "+s.right+ ". No se esperaba este componente: " +s.value+"."); 
    } 

    //Codigo para errores que ya no se pueden recuperar
    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception{ 
        System.out.println("Error sÃ­ntactico irrecuperable en la LÃ­nea " + 
        (s.left)+ " Columna "+s.right+". Componente " + s.value + 
        " no reconocido."); 
    }  


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIO ::= llave1 CABEZA 
            {
              Object RESULT =null;
		System.out.println("Cadena aceptada");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // CABEZA ::= CONJUNTO CABEZA 
            {
              Object RESULT =null;
		
              CUP$parser$result = parser.getSymbolFactory().newSymbol("CABEZA",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // CABEZA ::= CONJUNTOEXP CABEZA 
            {
              Object RESULT =null;
		
              CUP$parser$result = parser.getSymbolFactory().newSymbol("CABEZA",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // CABEZA ::= SEPARAR CUERPO 
            {
              Object RESULT =null;
		
              CUP$parser$result = parser.getSymbolFactory().newSymbol("CABEZA",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // CONJUNTO ::= conj dospuntos id guion mayorq CUERPOCONJUNTOS puntocoma 
            {
              Object RESULT =null;
		System.out.println("Elementos aceptados");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("CONJUNTO",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // CUERPOCONJUNTOS ::= palabra ELEMENTOS 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("CUERPOCONJUNTOS",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // CUERPOCONJUNTOS ::= casomin 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("CUERPOCONJUNTOS",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // CUERPOCONJUNTOS ::= casomayus 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("CUERPOCONJUNTOS",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // CUERPOCONJUNTOS ::= casonum 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("CUERPOCONJUNTOS",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // CUERPOCONJUNTOS ::= casosim 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("CUERPOCONJUNTOS",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // ELEMENTOS ::= coma ELEMENTOS 
            {
              Object RESULT =null;
		
              CUP$parser$result = parser.getSymbolFactory().newSymbol("ELEMENTOS",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // ELEMENTOS ::= palabra ELEMENTOS 
            {
              Object RESULT =null;
		
              CUP$parser$result = parser.getSymbolFactory().newSymbol("ELEMENTOS",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // ELEMENTOS ::= palabra 
            {
              Object RESULT =null;
		
              CUP$parser$result = parser.getSymbolFactory().newSymbol("ELEMENTOS",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // CONJUNTOEXP ::= id guion mayorq EXPRESION puntocoma 
            {
              Object RESULT =null;
		System.out.println("Expresion aceptada");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("CONJUNTOEXP",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // EXPRESION ::= punto EXPRESION EXPRESION 
            {
              Object RESULT =null;
		System.out.println("Punto");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPRESION",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // EXPRESION ::= cadena 
            {
              Object RESULT =null;
		System.out.println("cadena");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPRESION",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // EXPRESION ::= invertida comilla 
            {
              Object RESULT =null;
		System.out.println("comilla");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPRESION",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // EXPRESION ::= invertida palabra 
            {
              Object RESULT =null;
		System.out.println("salto");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPRESION",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // EXPRESION ::= barra EXPRESION EXPRESION 
            {
              Object RESULT =null;
		System.out.println("OR");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPRESION",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // EXPRESION ::= llave1 id llave2 
            {
              Object RESULT =null;
		System.out.println("conjunto");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPRESION",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // EXPRESION ::= asterisco EXPRESION 
            {
              Object RESULT =null;
		System.out.println("asterisco");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPRESION",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // EXPRESION ::= mas EXPRESION 
            {
              Object RESULT =null;
		System.out.println("mas");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPRESION",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // EXPRESION ::= interrogacion EXPRESION 
            {
              Object RESULT =null;
		System.out.println("Interrogacion");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPRESION",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // CUERPO ::= id dospuntos cadena puntocoma CUERPO 
            {
              Object RESULT =null;
		System.out.println("Expresiones aceptada");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("CUERPO",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // CUERPO ::= llave2 
            {
              Object RESULT =null;
		System.out.println("fin");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("CUERPO",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // SEPARAR ::= separador separador separador separador 
            {
              Object RESULT =null;
		System.out.println("fin cabeza");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("SEPARAR",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}
