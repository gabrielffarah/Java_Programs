class Celula {
   private int elemento;
   private Celula inf, sup, esq, dir;

   public Celula(){
      this(0, null, null, null, null);
   }

   public Celula(int elemento){
      this(elemento, null, null, null, null);
   }

   public Celula(int elemento, Celula inf, Celula sup, Celula esq, Celula dir){
      this.elemento = elemento;
      this.inf = inf;
      this.sup = sup;
      this.esq = esq;
      this.dir = dir;
   }
}


class Matriz {
   private Celula inicio;
   private int linha, coluna;

   public Matriz (){
      this.linha = this.coluna = 3;

      //alocar a matriz com this.linha linhas e this.coluna colunas
   }

   public Matriz (int linha, int coluna){
	
	
		this.linha = linha;
		this.coluna = coluna;

		Celula on = null;
		Celula below = null;
		Celula atual = null;
		int condicao = 0; 

		for(int i = 0; i <= linha; i++) {

			if(i == 0) {

				inicio = new Celula();
				atual = inicio;
				
			}

			else {

				on = atual;
				for(int j = 0; j < coluna - 1; j++) {

					on.dir = new Celula();
					on = on.dir;
					
				}

				if(i == linha) {

					i++;
					
				}

				else {

					atual.inf = new Celula();
					atual = atual.inf;
					on = atual;

				}

			}//end else
			
		}//end for

		atual = inicio;
		on = atual;
		below = on.inf;
		for(int i = 0; i < linha - 1; i++) {

			atual = below;

			for(int j = 0; j < coluna; j++) {

				on.inf = below;
				below.sup = on;
				condicao = coluna - j;

				if(condicao == 1) {
					
					j++;

				}
				
				else {

					on.dir.esq = on;
					below.dir.esq = below;
					on = on.dir;
					below = below.dir;

				}

				condicao = 0;
			} // end for

			on = atual;
			below = on.inf;

		}//end for

		on = below = atual = null;    
	


   }

   public Matriz soma (Matriz m) {
      Matriz resp = null;

      if(this.linha == m.linha && this.coluna == m.coluna){
         //...
      }

      return resp;
   }

   public Matriz multiplicacao (Matriz m) {
      Matriz resp = null;

      if(){
         //...
      }

      return resp;
   }

   public boolean isQuadrada(){
      boolean (this.linha == this.coluna);
   }

   public void mostrarDiagonalPrincipal (){
      if(isQuadrada() == true){

      }
   }

   public void mostrarDiagonalSecundaria (){
      if(isQuadrada() == true){

      }
   }
}

public class Matriz_dinamica {

   public static void main(String[] args){
      Matriz m1, m2, soma, m3, m4, multiplicao;

      m1 = new Matriz(MyIO.readInt("Digite o numero de linhas (M1): "), MyIO.readInt("Digite o numero de colunas (M1): "));
      m2 = new Matriz(MyIO.readInt("Digite o numero de linhas (M2): "), MyIO.readInt("Digite o numero de colunas (M2): "));
      m3 = new Matriz(MyIO.readInt("Digite o numero de linhas (M3): "), MyIO.readInt("Digite o numero de colunas (M3): "));
      m4 = new Matriz(MyIO.readInt("Digite o numero de linhas (M4): "), MyIO.readInt("Digite o numero de colunas (M4): "));

      /*
      m1.ler();
      m2.ler();
      m3.ler();
      m4.ler();

      //Somar as duas matrizes e salvar o resultado na matriz soma
      soma = m1.soma(m2); //verifique se eh possivel somar

      //Imprimir a matriz 1
      soma.print();

      //Multiplicar duas matrizes e salvar o resultado na matriz multiplicacao
      multiplicacao = m3.multiplicacao(m4); //verifique se eh possivel multiplicar

      //Imprimir a matriz 1
      multiplicacao.print();
      */

   }
}



