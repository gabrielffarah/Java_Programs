import java.io.*;
import java.*;
import java.nio.charset.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

class Serie{

private String nome;
private String formato;
private String duracao;
private String paisOrigem;
private String idioma;
private String emissora;
private String transmissao;
private int temporadas;
private int episodios;

public Serie(){

this.nome = "";
this.formato = "";
this.duracao = "";
this.paisOrigem = "";
this.idioma = "";
this.emissora = "";
this.transmissao = "";
this.temporadas = 0;
this.episodios = 0;

}

public Serie(String nome,String formato,String duracao,String paisOrigem,String idioma,String emissora,String transmissao,int temporadas,int episodios ){

this.nome = nome;
this.formato = formato;
this.duracao = duracao;
this.paisOrigem = paisOrigem;
this.idioma = idioma;
this.emissora = emissora;
this.transmissao = transmissao;
this.temporadas = temporadas;
this.episodios = episodios;

}

public String getNome(){
	return this.nome;
}
public void setNome(String nome){
	this.nome = nome;
}

public String getFormato(){
       return this.formato;
}
public void setFormato(String formato){
        this.formato = formato;
}

public String getDuracao(){
        return this.duracao;
}
public void setDuracao(String duracao){
        this.duracao = duracao;
}

public String getPaisOrigem(){
        return this.paisOrigem;
}
public void setPaisOrigem(String paisOrigem){
        this.paisOrigem = paisOrigem;
}

public String getIdioma(){
        return this.idioma;
}
public void setIdioma(String idioma){
        this.idioma = idioma;
}

public String getEmissora(){
        return this.emissora;
}
public void setEmissora(String emissora){
        this.emissora = emissora;
}

public String getTransmissao(){
        return this.transmissao;
}
public void setTransmissao(String transmissao){
        this.transmissao = transmissao;
}

public int getTemporadas(){
        return this.temporadas;
}
public void setTemporadas(int temporadas){
        this.temporadas = temporadas;
}

public int getEpisodios(){
        return this.episodios;
}
public void setEpisodios(int episodios){
        this.episodios = episodios;
}

public Serie clone(){

Serie serie = new Serie();

serie.nome = this. nome;
serie.formato = this.formato;
serie.duracao = this.duracao;
serie.paisOrigem = this.paisOrigem;
serie.idioma = this.idioma;
serie.emissora = this.emissora;
serie.transmissao = this.transmissao;
serie.temporadas = this.temporadas;
serie.episodios = this.episodios;

return serie;
}

public void imprimir(){

MyIO.println(this.nome + " " +
             this.formato + " " +
             this.duracao + " " +
             this.paisOrigem + " " +
             this.idioma + " " +
             this.emissora + " " +
             this.transmissao + " " +
             this.temporadas + " " +
             this.episodios + " " 
             );
}



public void ler(String nomeArquivo){
      try{
      String linha;
	  BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("/tmp/"+nomeArquivo), "ISO-8859-1"));

      for(linha = br.readLine(); linha.contains("<h1") == false; linha = br.readLine());
      String nome = getSubstringEntre(linha, "lang=\"pt\"><i>", "</i>");
      this.setNome(nome);
      
      for(linha = br.readLine(); linha.contains("Formato") == false; linha = br.readLine());
      String formato = removeTags(br.readLine());
      this.setFormato(formato);
      
      for(linha = br.readLine(); linha.contains("Dura") == false; linha = br.readLine());
      String dur = removeTags(br.readLine());
      this.setDuracao(dur);
      
      for(linha = br.readLine(); linha.contains("de origem") == false; linha = br.readLine());
      String pais = removeTags(br.readLine());
      this.setPaisOrigem(pais);
      
      for(linha = br.readLine(); linha.contains("Idioma") == false; linha = br.readLine());
      String idioma = removeTags(br.readLine());
      this.setIdioma(idioma);
      
      for(linha = br.readLine(); linha.contains("Emissora") == false; linha = br.readLine());
      String emissora = removeTags(br.readLine());
      this.setEmissora(emissora);
      
      for(linha = br.readLine(); linha.contains("Transmiss") == false; linha = br.readLine());
      String transmissao = removeTags(br.readLine());
      this.setTransmissao(transmissao);
      
      for(linha = br.readLine(); linha.contains("de temporadas") == false; linha = br.readLine());
      String temporadas = removeTags(br.readLine());
      int aux = soInt(temporadas);
      this.setTemporadas(aux);
      
      for(linha = br.readLine(); linha.contains("de epis") == false; linha = br.readLine());
      String episodios = removeTags(br.readLine());
      aux = soInt(episodios);
      this.setEpisodios(aux);
      
      
   
      Arq.close();
      }
      catch(IOException e){
      
      }
   }
 public static int indexOf(String str, char c){
      int resp = -1;
      
      for(int i = 0; i < str.length(); i++){
         if(c == str.charAt(i)){
            resp = 1;
         }
      }
      return resp;
   }

   public static int soInt(String str){
      int resp = 0;
      String numero = "";
      String inter = "0123456789";
      for(int i = 0; i < str.length(); i++){
         if(indexOf(inter, str.charAt(i)) == -1){
            i = str.length();  
         } else {
			 numero += str.charAt(i);
		 }
      }
      
      resp = Integer.parseInt(numero);
      
      return resp;
   }


public String removeTags( String str )
  {
    // definir dados
    String result = "";

    // anda na string toda
    for( int i = 0; i < str.length( ); i++ )
    {
      // olha a primeira tag
      while( i < str.length( ) && str.charAt( i ) == '<' )
      {
        // despreza a tag
        for( i++; str.charAt( i ) != '>'; i++ );
        i++;

        while( i < str.length( ) && str.charAt( i ) == '&' )
        {
          for( i++; str.charAt( i ) != ';'; i++ );
          i++;
        }// end while
      }// end while

      while( i < str.length( ) && str.charAt( i ) == '&' )
      {
        for( i++; str.charAt( i ) != ';'; i++ );
        i++;
        result += ' ';
      }// end while

      if( i < str.length( ))
      {
        result += str.charAt( i );
      }// end if
    }// end for

    while( result.length( ) > 0 && result.charAt( 0 ) == ' ' )
    {
      result = result.substring( 1 );
    }// end while

    return( result );
  }// end removeTags( )

  public String getSubstringEntre( String str, String antes, String depois )
  {
    // definir dados
    String result = "";
    int posInicio, posFim;

    // pegando a posicao do inicio
    posInicio = str.indexOf( antes ) + antes.length( );

    // testa se o antes eh diferente do depois
    if( antes.compareTo( depois ) != 0 )
    {
      posFim = str.indexOf( depois );
    }
    else
    {
      posFim = str.indexOf( depois, posInicio );
    }// end if

    // pegando a substring
    if( 0 <= posInicio && posInicio < posFim && posFim < str.length( ))
    {
      result = str.substring( posInicio, posFim );
    }// end if

    return( result );
  }// end getSubstringEntre( )

  /**
   * Metodo getIntEntre( )
   * @param  String s      - string analisada.
     * @param  String antes  - o que tem antes.
     * @param  String depois - o que tem depois.
     * @return retorna um valor inteiro.
   */
  public int getIntEntre( String s, String antes, String depois )
  {
      return( new Integer( getSubstringEntre( s, antes, depois ).replace( ".", "" ).trim( ))).intValue( );
    }// end getIntEntre( )


class Celula {

	public Serie serie; // Elemento inserido na celula.

	public Celula prox; // Aponta a celula prox.
        /**

	 * Construtor da classe.

	 */

	public Celula() {

		this.serie = null;
                this.prox = null;

	}
	/**

	 * Construtor da classe.

	 * @param elemento int inserido na celula.

	 */

	public Celula(Serie serie) {

      this.serie = serie.clone();

      this.prox = null;

	}

}
  class Lista {
	private Celula primeiro;
	private Celula ultimo;


	/**
	 * Construtor da classe que cria uma lista sem elementos (somente no cabeca).
	 */
	public Lista() {
		primeiro = new Celula();
		ultimo = primeiro;
	}


	/**
	 * Insere um elemento na primeira posicao da lista.
    * @param x int elemento a ser inserido.
	 */
	public void inserirInicio(Serie serie) {
		Celula tmp = new Celula(serie);
                tmp.prox = primeiro.prox;
		primeiro.prox = tmp;
		if (primeiro == ultimo) {                 
			ultimo = tmp;
		}
        tmp = null;
	}


	/**
	 * Insere um elemento na ultima posicao da lista.
    * @param x int elemento a ser inserido.
	 */
	public void inserirFim(Serie serie) {
		ultimo.prox = new Celula(serie);
		ultimo = ultimo.prox;
	}


	/**
	 * Remove um elemento da primeira posicao da lista.
    * @return resp int elemento a ser removido.
	 * @throws Exception Se a lista nao contiver elementos.
	 */
	public int removerInicio() throws Exception {
		if (primeiro == ultimo) {
			throw new Exception("Erro ao remover (vazia)!");
		}

                Celula tmp = primeiro;
		primeiro = primeiro.prox;
		Serie resp = primeiro.serie.clone();
                tmp.prox = null;
                tmp = null;
		return resp;
	}


	/**
	 * Remove um elemento da ultima posicao da lista.
    * @return resp int elemento a ser removido.
	 * @throws Exception Se a lista nao contiver elementos.
	 */
	public int removerFim() throws Exception {
		if (primeiro == ultimo) {
			throw new Exception("Erro ao remover (vazia)!");
		} 

		// Caminhar ate a penultima celula:
      Celula i;
      for(i = primeiro; i.prox != ultimo; i = i.prox);

      int resp = ultimo.elemento; 
      ultimo = i; 
      i = ultimo.prox = null;
      
		return resp;
	}


	/**
    * Insere um elemento em uma posicao especifica considerando que o 
    * primeiro elemento valido esta na posicao 0.
    * @param x int elemento a ser inserido.
	 * @param pos int posicao da insercao.
	 * @throws Exception Se <code>posicao</code> invalida.
	 */
   public void inserir(Serie serie, int pos) throws Exception {

      int tamanho = tamanho();

      if(pos < 0 || pos > tamanho){
			throw new Exception("Erro ao inserir posicao (" + pos + " / tamanho = " + tamanho + ") invalida!");
      } else if (pos == 0){
         inserirInicio(serie);
      } else if (pos == tamanho){
         inserirFim(serie);
      } else {
		   // Caminhar ate a posicao anterior a insercao
         Celula i = primeiro;
         for(int j = 0; j < pos; j++, i = i.prox);
		
         Celula tmp = new Celula(serie);
         tmp.prox = i.prox;
         i.prox = tmp.clone();
         tmp = i = null;
      }
   }


	/**
    * Remove um elemento de uma posicao especifica da lista
    * considerando que o primeiro elemento valido esta na posicao 0.
	 * @param posicao Meio da remocao.
    * @return resp int elemento a ser removido.
	 * @throws Exception Se <code>posicao</code> invalida.
	 */
	public int remover(int pos) throws Exception {
      int resp;
      int tamanho = tamanho();

		if (primeiro == ultimo){
			throw new Exception("Erro ao remover (vazia)!");

      } else if(pos < 0 || pos >= tamanho){
			throw new Exception("Erro ao remover (posicao " + pos + " / " + tamanho + " invalida!");
      } else if (pos == 0){
         resp = removerInicio();
      } else if (pos == tamanho - 1){
         resp = removerFim();
      } else {
		   // Caminhar ate a posicao anterior a insercao
         Celula i = primeiro;
         for(int j = 0; j < pos; j++, i = i.prox);
		
         Celula tmp = i.prox;
         resp = tmp.serie;
         i.prox = tmp.prox;
         tmp.prox = null;
         i = tmp = null;
      }

		return resp.clone();
	}

	/**
	 * Mostra os elementos da lista separados por espacos.
	 */
	public void mostrar() {
		
		for (Celula i = primeiro.prox; i != null; i = i.prox) {
			i.serie.imprimir();
		}
		
	}

	/**
	 * Procura um elemento e retorna se ele existe.
	 * @param x Elemento a pesquisar.
	 * @return <code>true</code> se o elemento existir,
	 * <code>false</code> em caso contrario.
	 */
      /*	public boolean pesquisar(int x) {
		boolean resp = false;
		for (Celula i = primeiro.prox; i != null; i = i.prox) {
         if(i.elemento == x){
            resp = true;
            i = ultimo;
         }
		}
		return resp;
	} */

	/**
	 * Calcula e retorna o tamanho, em numero de elementos, da lista.
	 * @return resp int tamanho
	 */
   public int tamanho() {
      int tamanho = 0; 
      for(Celula i = primeiro; i != ultimo; i = i.prox, tamanho++);
      return tamanho;
   }
}

public class Lista_flexivel{

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


   public static void main (String [ ]args)throws Exception  {

      Serie serie = new Serie();   
      Lista lista = new Lista(500);
   
      String linha = "";
      linha = MyIO.readLine();
   
     //entrada e saida 
   
      while (!(linha.equals("FIM"))){
      
         serie.ler(linha); //le as series
         
         //System.out.println("=== >>" + linha); 

         lista.inserirFim(serie); //cria lista
      
         linha = MyIO.readLine();
      
      }
   
      String linha2 = "";
   
      int x = Integer.parseInt(MyIO.readLine());
   
      for (int i = 0; i < x; i++ ) {
      
         linha2 = MyIO.readLine();
      
      //teste para metodos de inserçao e remorçao
      
         if (linha2.charAt(0)=='I') {
         
            if (linha2.charAt(1) =='I' || linha2.charAt(1) == 'F') {
            
            
               String vetTemp[] = linha2.split(" ");          
            
            
               if (linha2.charAt(1) == 'I') {
               
                  serie.ler(vetTemp[1]);
               
                  lista.inserirInicio(serie);
               
               }
               if(linha2.charAt(1) == 'F') {
               
                  serie.ler(vetTemp[1]);
               
                  lista.inserirFim(serie);
               
               }
            }
            if(linha2.charAt(1) == '*') {
            
               String vetTemp[] = linha2.split(" ");
            
               serie.ler(vetTemp[2]);
            
               lista.inserir(serie,Integer.parseInt(vetTemp[1]));
            
            
            }
         }
         else if (linha2.charAt(0) == 'R'){
         
            String vetTemp2[] = linha2.split(" ");
         
            if(linha2.charAt(1) == 'I'){
            
               serie = lista.removerInicio();
            
               MyIO.println("(R) "+ serie.getNome());
            
            }
            if(linha2.charAt(1)=='F'){
            
               serie = lista.removerFim();
            
               MyIO.println("(R) "+ serie.getNome());
            
            }
            if(linha2.charAt(1) == '*') {
            
               int pos = Integer.parseInt(vetTemp2[1]);
            
               serie = lista.remover(pos);
            
               MyIO.println("(R) "+ serie.getNome());
            }
         
         }
      
      }// end for

      lista.mostrar();
   }
}



