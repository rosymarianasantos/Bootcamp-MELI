package teste;

public class Exemplo {
    public static void main(String[] args) {
        String cidades[] = new String[10];
        cidades[0] = "Londres";
        cidades[1] = "Madrid";
        cidades[2] = "Nueva York";
        cidades[3] = "Buenos Aires";
        cidades[4] = "Asunción";
        cidades[5] = "São Paulo";
        cidades[6] = "Lima";
        cidades[7] = "Santiago de Chile";
        cidades[8] = "Lisboa";
        cidades[9] = "Tokio";
        int temperaturas[][] = new int[10][10];
        temperaturas[0][0] = -2;
        temperaturas[0][1] = 33;
        temperaturas[1][0] = -3;
        temperaturas[1][1] = 32;
        temperaturas[2][0] = -8;
        temperaturas[2][1] = 27;
        temperaturas[3][0] = 4;
        temperaturas[3][1] = 37;
        temperaturas[4][0] = 6;
        temperaturas[4][1] = 42;
        temperaturas[5][0] = 5;
        temperaturas[5][1] = 43;
        temperaturas[6][0] = 0;
        temperaturas[6][1] = 39;
        temperaturas[7][0] = -7;
        temperaturas[7][1] = 26;
        temperaturas[8][0] = -1;
        temperaturas[8][1] = 31;
        temperaturas[9][0] = -10;
        temperaturas[9][1] = 35;

        int menor = 0;
        int maior = 0;
        int indicebaixa = 0;
        int indicealta = 0;

        for(int i=0; i<10; i++) {
            for (int j=0; j<2; j++) {
                if(menor > temperaturas[i][j]) {
                   menor = temperaturas[i][j];
                    indicebaixa = i;
                }
                if(maior < temperaturas[i][j]) {
                    maior = temperaturas[i][j];
                    indicealta = i;
                }
            }
        }
        System.out.println("A cidade com maior temperatura é:" + cidades[indicealta]);
        System.out.println("Maior temperatura é:" + maior);
        System.out.println("A cidade com menor temperatura é:" + cidades[indicebaixa]);
        System.out.println("Menor temperatura é:" + menor);
    }
}
