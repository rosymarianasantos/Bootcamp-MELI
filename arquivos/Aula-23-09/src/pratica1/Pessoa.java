package pratica1;

public class Pessoa {
        String name;
        int age;
        String ID;
        int height;
        int weight;

        public Pessoa() {}

        public Pessoa(String name, int age, String ID) {
                this.name = name;
                this.age = age;
                this.ID = ID;
        }

        public Pessoa(String name, int age, String ID, int height, int weight) {
                this.name = name;
                this.age = age;
                this.ID = ID;
                this.height = height;
                this.weight = weight;
        }

        public int calcularIMC() {
               double IMC = this.weight/((this.height*0.01)*(this.height*0.01));
               if(IMC < 20) {
                       return -1;
               }
               if(IMC >= 20 && IMC <= 25) {
                       return 0;
               }
               else {
                       return 1;
               }
        }

        public boolean ehMaiorIdade() {
                if(this.age < 18) {
                        return false;
                }
                else {
                        return  true;
                }
        }

        public String getName() {
                return name;
        }

        public String getID() {
                return ID;
        }

        public int getHeight() {
                return height;
        }

        public int getWeight() {
                return weight;
        }

        public void setName(String name) {
                this.name = name;
        }

        public void setID(String ID) {
                this.ID = ID;
        }

        public void setHeight(int height) {
                this.height = height;
        }

        public void setWeight(int weight) {
                this.weight = weight;
        }
}
