package fatec.poo.model;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 *
 * @author 0030481521022
 */
public class Cliente {
    private int identificacao;
    private String cpf;
    private double saldo;
    private ArrayList<Lancamento> lancamentos = new ArrayList<Lancamento>();
    DecimalFormat df = new DecimalFormat("#,##0.00");

    public Cliente(int identificacao, String cpf, double saldo) {
        this.identificacao = identificacao;
        this.cpf = cpf;
        this.saldo = saldo;
        lancamentos = new ArrayList<Lancamento>();
    }

    public int getIdentificacao() {
        return identificacao;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void addLancamento(Lancamento l) {
        if (l.getTipo().equals("C")) {
            saldo += l.getValor();
        } else {
            saldo -= l.getValor();
        }
        lancamentos.add(l);
    }
    
    public void exibirLancamentos() {
        System.out.println("\n\nCPF: " + cpf);
        System.out.println("Saldo: " + df.format(saldo));
        System.out.println("\n\t\tLançamentos");
        for (int i = 0; i < lancamentos.size(); i++) {
            System.out.println("\nCódigo: " + lancamentos.get(i).getCodigo());
            System.out.println("Tipo: " + lancamentos.get(i).getTipo());
            System.out.println("Valor: " + df.format(lancamentos.get(i).getValor()));
        }
    }
}
