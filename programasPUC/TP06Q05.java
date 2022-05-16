/**
  * Questao 05 - TP6
  *
  * @author: Luiz Gustavo Braganca dos Santos
  * Matricula: 524507
  * Professor: Max do Val Machado
  *
  * @version: 0.1
  * Data da Criação: 15/10/2016
  */

import java.util.*;

/**
 * Classe Celula.
 */
class Celula
{
	// definir dados
	public int elemento;
	public Celula inf, sup, esq, dir;

	/**
	 * Construtor da classe.
	 */
	public Celula( )
	{
		this( 0, null, null, null, null );
	}// end construtor

	/**
	 * Construtor da classe.
	 * @param  elemento - numero.
	 */
	public Celula( int elemento )
	{
		this( elemento, null, null, null, null );
	}// end construtor

	/**
	 * Metodo construtor.
	 * @param  elemento - elemento.
	 * @param  inf      - ponteiro inferior
	 * @param  sup      - ponteiro superior
	 * @param  esq      - ponteiro da esquerda
	 * @param  dir      - ponteiro da direita
	 */
	public Celula( int elemento, Celula inf, Celula sup, Celula esq, Celula dir )
	{
		this.elemento = elemento;
		this.inf = inf;
		this.sup = sup;
		this.esq = esq;
		this.dir = dir;
	}// end construtor
}// end class Celula

/**
 * Classe Matriz.
 */
class Matriz
{
	// definir dados
	private Celula inicio;
	private int linha, coluna;

	/**
	 * Construtor da classe.
	 */
	public Matriz( )
	{
		inicio = null;
		this.linha = this.coluna = 3;
	}// end construtor

	/**
	 * Construtor da classe.
	 * @param  linha  - quantidade de linhas da matriz.
	 * @param  coluna - quantidade de colunas da matriz.
	 */
	public Matriz( int linha, int coluna )
	{
		inicio = null;
		this.linha = linha;
		this.coluna = coluna;
	}// end construtor

	/**
	 * Metodo soma( ) - soma elementos da matriz.
	 * @param  m - a Matriz.
	 * @return retorna a matriz
	 */
	public Matriz soma( Matriz m )
	{
		// definir dados
		Matriz resp = null;

		if(( this.linha == m.linha ) && ( this.coluna == m.coluna ))
		{
			//Celula i = resp;
			Celula j, l;
		}// end if

		return( resp );
	}// end soma( )

	/**
	 * Metodo multiplicacao( ) - multiplica matrizes.
	 * @param  m    - Matriz passada.
	 * @return resp - Retorna matriz multiplicada.
	 */
	public Matriz multiplicacao( Matriz m )
	{
		// definir dados
		Matriz resp = null;

		if(( this.linha == m.linha ) && ( this.coluna == m.coluna ))
		{

		}// end if
		
		return( resp );
	}// end multipicacao( )

	/**
	 * Metodo isQuadrada( ).
	 * @return resp - retorna se a matriz e' quadrada ou nao.
	 */
	public boolean isQuadrada( )
	{
		// definir dados
		boolean resp = ( this.linha == this.coluna );

		return( resp );
	}// end isQuadrada( )

	/**
	 * Metodo mostrarDiagonalPrincipal( ).
	 */
	public void mostrarDiagonalPrincipal( )
	{
		// verificando se e' uma matriz quadrada
		if( isQuadrada() == true )
		{
			// andando na matriz
			for( Celula i = inicio; i.inf != null && i.dir != null; i = i.dir, i = i.inf )
			{
				MyIO.println( i.elemento );
			}// end for
		}// end if
	}// end mostrarDiagonalPrincipal( )

	/**
	 * Metodo mostrarDiagonalSecundaria( ).
	 */
	public void mostrarDiagonalSecundaria( )
	{
		// verifica se a matriz e' quadrada
		if( isQuadrada( ) == true )
		{
			// definir dados
			Celula i;

			// ponteiro anda para a direita
			for( i = inicio; i.dir != null; i = i.dir );

			// mostrando elementos
			for( ; i.esq != null && i.inf != null; i = i.esq, i = i.inf )
			{
				MyIO.println( i.elemento );
			}// end for
		}// end if
	}// end mostrarDiagonalSecundaria( )

	/**
	 * Metodo ler( ).
	 * @param  num - insere numero.
	 */
	public void ler( )
	{
		int num = MyIO.readInt( "numero: " );

		if( isQuadrada( ) == true )
		{
			// cria elemento
			Celula tmp = new Celula( num );

			//for( Celula i = inicio; i.dir != null && i.inf != null; i = i.dir );

			tmp.esq = inicio;

			tmp.dir = inicio.dir;

			inicio.dir = tmp;

			// tirando a variavel tmp da estrutura
			tmp = null;
		}// end if
	}// end ler( )

	/**
	 * [print description]
	 */
	public void print( )
	{

	}// end print( )
}// end class Matriz

public class TP06Q05
{
	/**
  	  * Metodo  equals( )      - compara duas strings.
  	  * @param  String s1      - primeira string.
  	  * @param  String s2      - segunda string.
  	  * @return boolean result - resultado da comparacao.
  	  */
	public static boolean equals( String s1, String s2 )
	{
		// definir dados
		int cont = 0;
		boolean result = false;

		// ve se o tamanho eh igual
		if( s1.length( ) == s2.length( ))
		{
			// olha cada letra da string se eh igual
			for( int i = 0; i < s1.length( ); i++ )
			{
				if( s1.charAt( i ) == s2.charAt( i ))
				{
					cont++;
				}// end if
			}// end 

			// se o contador for igual o tamanho da string, 
			// as duas strings sao iguais
			if( cont == s2.length( ))
			{
				result = true;
			}// end if
		}// end if
		
		return( result );
	}// end equals( )

	/**
	 * Metodo Main( ).
	 */
	public static void main( String [] args )
	{
		// definir dados
		int    num = 0;
		int    linha, coluna;
		Matriz m1, m2, m3, m4, soma, mult;

		//-------------------------------- Primeira Matriz
		
		// lendo linhas e colunas
		linha  = MyIO.readInt( "linhas: " );
		coluna = MyIO.readInt( "colunas: " );
		
		// lendo matrizes
		m1 = new Matriz( linha, coluna );

		//for( int i = 0; i < linha && i < coluna; i++ )
			m1.ler( );
		/*
		//-------------------------------- Segunda Matriz
		
		linha  = MyIO.readInt( );
		coluna = MyIO.readInt( );
		
		// lendo matrizes
		m2 = new Matriz( linha, coluna );

		//-------------------------------- Terceira Matriz
		
		linha  = MyIO.readInt( );
		coluna = MyIO.readInt( );
		
		// lendo matrizes
		m3 = new Matriz( linha, coluna );

		//-------------------------------- Quarta Matriz
		
		linha  = MyIO.readInt( );
		coluna = MyIO.readInt( );
		
		// lendo matrizes
		m4 = new Matriz( linha, coluna );

		// lendo matrizes
		m1.ler( );
		m2.ler( );
		m3.ler( );
		m4.ler( );

		// soma as duas matrizes e salva o resultado na matriz soma
		soma = m1.soma( m2 );

		// imprimindo a matriz 1
		soma.print( );

		// multiplicando 
		mult = m3.multiplicacao( m4 );

		// imprime a matriz 1
		mult.print( );*/
	}// end main( )
}// end class TP05Q08
