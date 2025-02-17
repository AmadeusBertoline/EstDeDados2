package controller;

public class MenorValorController {

	public MenorValorController() {
		super();
	}

	public int BuscarMenor(int[] n, int tamanho, int menor) {
		
		if(tamanho == 0) {
			return menor;
		}else {
			tamanho--;
			if(menor > n[tamanho]){
				menor = n[tamanho];
			}
			return BuscarMenor(n, tamanho, menor);
		}
	}

}

//A condição de parada foi definida conforme o primeiro índice do vetor = 0;
//A relação dos passos foi feita comparando o valor atual da varíavel menor e caso ela fosse maior que o valor atual
//do vetor orientado pelo indice do tamanho reduzido, substituir pelo novo valor.

