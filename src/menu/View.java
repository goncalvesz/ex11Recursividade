package menu;

import javax.swing.JOptionPane;

import Controller.RecursividadeController;

public class View {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecursividadeController recursiva = new RecursividadeController();
		
		int[] vetor1 = {1,2,3,4,5,6,7,8,9,10,11}; int tamanho1 = (vetor1.length)-1;
		int[] vetor2 = {1,2,3,4,5,6,7,8,9,10}; int tamanho2 = (vetor2.length)-1;
		int[] vetor3 = {1}; int tamanho3 = (vetor3.length)-1;
		
		StringBuilder vetores = new StringBuilder();


		
		recursiva.ordenaVetor(vetor1, 0,tamanho1);
		recursiva.ordenaVetor(vetor2, 0,tamanho2);
		recursiva.ordenaVetor(vetor3, 0,tamanho3);

		for (int i = 0; i <= tamanho1;i++) {
			vetores.append(vetor1[i] + " | ");
		}
		vetores.append("\n");
		for (int i = 0; i <= tamanho2;i++) {
			vetores.append(vetor2[i] + " | ");
		}
		vetores.append("\n");
		for (int i = 0; i <= tamanho3;i++) {
			vetores.append(vetor3[i] + " | ");
		}
		
		JOptionPane.showMessageDialog(null, vetores);
	}
}
