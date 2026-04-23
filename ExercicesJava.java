public class ExercicesJava {

    public static void main(String[] args) {

        System.out.println("   PARTIE 1 : PRE-INCREMENTATION ET POST-INCREMENTATION");

        System.out.println("\n Exercice 1 ");
        int i1 = 2;
        int res1 = i1++;
                         
        System.out.println("res = " + res1);
        System.out.println("i   = " + i1);  

        // Exercice 2 : Pré-incrémentation

        System.out.println("\n Exercice 2 ");
        int i2 = 2;
        int res2 = ++i2;
                        
        System.out.println("res = " + res2); 
        System.out.println("i   = " + i2); 

        // Exercice 3 : Mélange post et pré 
      
        System.out.println("\n Exercice 3 ");
        int i3 = 5;
        int res3 = i3++ + ++i3;
    
        System.out.println("res = " + res3); 
        System.out.println("i   = " + i3); 

        // Exercice 4 : Double pré-incrémentation 
        System.out.println("\n Exercice 4 ");
        int i4 = 1;
        int res4 = ++i4 + ++i4;
        System.out.println("res = " + res4);
        System.out.println("i   = " + i4);

        // Exercice 5 : Réécriture sans ++

        System.out.println("\n Exercice 5 ");
        int i5 = 3;
        int res5 = i5 + 2; 
        i5 = i5 + 1;       
        System.out.println("res = " + res5);
        System.out.println("i   = " + i5); 


        System.out.println("   PARTIE 2 : TABLEAUX (1 DIMENSION)");

        // Exercice 6 : Déclaration et initialisation d'un tableau

        System.out.println("\n Exercice 6 : Déclaration du tableau ");

        int[] tab = {10, 20, 30, 40, 50};
        System.out.println("Tableau créé : {10, 20, 30, 40, 50}");

        // Exercice 7 : Afficher tous les éléments

        System.out.println("\n Exercice 7 : Affichage des éléments ");
        for (int i = 0; i < tab.length; i++) {
            System.out.println("tab[" + i + "] = " + tab[i]);
        }

        // Exercice 8 : Somme des éléments

        System.out.println("\n Exercice 8 : Somme ");
        int somme = 0;
        for (int i = 0; i < tab.length; i++) {
            somme += tab[i];
        }
        System.out.println("Somme = " + somme);

        // Exercice 9 : Maximum et Minimum

        System.out.println("\n Exercice 9 : Max et Min ");
        int max = tab[0]; 
        int min = tab[0];

        for (int i = 1; i < tab.length; i++) { 
            if (tab[i] > max) {
                max = tab[i]; 
            }
            if (tab[i] < min) {
                min = tab[i];
            }
        }
        System.out.println("Max = " + max); 
        System.out.println("Min = " + min); 

        // Exercice 10 : Copier un tableau dans un autre

        System.out.println("\n Exercice 10 : Copie du tableau ");
        int[] copie = new int[tab.length]; 

        for (int i = 0; i < tab.length; i++) {
            copie[i] = tab[i]; 
        }

        System.out.print("Tableau copié : ");
        for (int val : copie) {
            System.out.print(val + " ");
        }
        System.out.println();


        System.out.println("   PARTIE 3 : TRI ET RECHERCHE");

        int[] tabTri = {64, 25, 12, 22, 11}; 

        // Exercice 11 : Tri par sélection

        System.out.println("\n Exercice 11 : Tri par sélection ");

        int[] selectionTab = {64, 25, 12, 22, 11};

        for (int i = 0; i < selectionTab.length - 1; i++) {
            int minIndex = i; 

            for (int j = i + 1; j < selectionTab.length; j++) {
                if (selectionTab[j] < selectionTab[minIndex]) {
                    minIndex = j; 
                }
            }

            int temp = selectionTab[minIndex]; 
            selectionTab[minIndex] = selectionTab[i];
            selectionTab[i] = temp;
        }

        System.out.print("Résultat tri sélection : ");
        for (int val : selectionTab) {
            System.out.print(val + " ");
        }
        System.out.println();

        // Exercice 12 : Tri à bulles 

        System.out.println("\n Exercice 12 : Tri à bulles ");

        int[] bubbleTab = {64, 25, 12, 22, 11}; 

        for (int i = 0; i < bubbleTab.length - 1; i++) {
            for (int j = 0; j < bubbleTab.length - 1 - i; j++) {
                if (bubbleTab[j] > bubbleTab[j + 1]) {
                    int temp = bubbleTab[j];
                    bubbleTab[j] = bubbleTab[j + 1];
                    bubbleTab[j + 1] = temp;
                }
            }
        }

        System.out.print("Résultat tri à bulles : ");
        for (int val : bubbleTab) {
            System.out.print(val + " ");
        }
        System.out.println();


        // Exercice 13 : Tri par insertion

        System.out.println("\n Exercice 13 : Tri par insertion ");

        int[] insertionTab = {64, 25, 12, 22, 11};

        for (int i = 1; i < insertionTab.length; i++) {
            int cle = insertionTab[i]; 
            int j = i - 1;            

            while (j >= 0 && insertionTab[j] > cle) {
                insertionTab[j + 1] = insertionTab[j]; 
                j--;
            }

            insertionTab[j + 1] = cle;
        }

        System.out.print("Résultat tri par insertion : ");
        for (int val : insertionTab) {
            System.out.print(val + " ");
        }
        System.out.println();


        // Exercice 14 : Recherche linéaire
        System.out.println("\n Exercice 14 : Recherche linéaire ");

        int[] rechercheTab = {10, 20, 30, 40, 50};
        int cible14 = 30;   
        int position = -1;   

        for (int i = 0; i < rechercheTab.length; i++) {
            if (rechercheTab[i] == cible14) {
                position = i; 
                break;        
            }
        }

        if (position != -1)
            System.out.println("Valeur " + cible14 + " trouvée à l'index " + position);
        else
            System.out.println("Valeur " + cible14 + " non trouvée");


        // Exercice 15 : Recherche binaire

        System.out.println("\n Exercice 15 : Recherche binaire ");

        int[] trieBinaire = {10, 20, 30, 40, 50};
        int cible15 = 40;
        int gauche  = 0;                    
        int droite  = trieBinaire.length - 1;
        int resultat = -1;                

        while (gauche <= droite) {                        
            int milieu = (gauche + droite) / 2;           

            if (trieBinaire[milieu] == cible15) {
                resultat = milieu;
                break;
            } else if (trieBinaire[milieu] < cible15) {
                gauche = milieu + 1;
            } else {
                droite = milieu - 1; 
            }
        }

        if (resultat != -1)
            System.out.println("Valeur " + cible15 + " trouvée à l'index " + resultat);
        else
            System.out.println("Valeur " + cible15 + " non trouvée");

        System.out.println("\n");
        System.out.println("   FIN DES EXERCICES");
        
    }
}
