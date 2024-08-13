package Controller;

/*
 * 6. Faça uma função recursiva que, dado um vetor, inverta seus valores (O valor que está na posição zero
troca de lugar com o valor que está na úl�ma posição, o valor que está na posição um troca de lugar com
o valor que está na penúl�ma posição e assim por diante). Testar com um vetor de 10 e um de 11 posições.
 */

public class RecursividadeController {

	public RecursividadeController() {
	
	}
	
	public int[] ordenaVetor (int[] vetor, int inicio, int parada) {
		int temp = 0;
		if (parada < 0) {
			return vetor;
		}
		if (inicio+1 <= parada) {
			temp = vetor[inicio]; 
			vetor[inicio] = vetor[parada];
			vetor[parada] = temp;
			return ordenaVetor(vetor, inicio+1, parada-1);
		}
		return vetor;
	}
}
