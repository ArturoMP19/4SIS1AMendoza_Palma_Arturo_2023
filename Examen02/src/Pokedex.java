/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Amp_1
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class Pokemon {
    String name;
    int id, Ps, Atack, Def, Vel, Esp, Total;
    String type;
//Ps, Ataque , DEfensa, Velocidad, Especial , suma
    public Pokemon(String name, int id , String type, int Ps, int Atack, int Def, int Vel, int Esp, int Total) {
        this.name = name;
        this.id = id;
        this.type = type;
        this.Ps = Ps;
        this.Atack = Atack;
        this.Def = Def;
        this.Vel = Vel;
        this.Esp = Esp;
        this.Total = Total;
        
        
       
    }

    public String toString() {
        System.out.println("Informacion del pokemon");
        return "ID: " + id + " --Nombre:"  + name + "\n" + " Tipo: " + type + "\n" + "PS: " + Ps + "  " + "Ataque: " + Atack + "  " + "Defensa: " + Def + "  " + "Velocidad: " + Vel
                + "  " + "Especial: " + Esp + "\n" + "Puntaje total " + Total ;
    }
}

public class Pokedex extends JFrame {
    private ArrayList<Pokemon> pokemonList;
    private JTextArea displayArea;

    public Pokedex() {
        pokemonList = new ArrayList<>();
        displayArea = new JTextArea(10, 40);
        displayArea.setEditable(false);

        // Envolver el JTextArea en un JScrollPane
        JScrollPane scrollPane = new JScrollPane(displayArea);

        JButton showButton = new JButton("Mostrar Pokedex");
        JButton searchButton = new JButton("Buscar Pokémon por ID");
        JButton exitButton = new JButton("Salir");

        showButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayPokedex();
            }
        });

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String idInput = JOptionPane.showInputDialog("Ingrese el ID del Pokémon:");
                try {
                    int id = Integer.parseInt(idInput);
                    Pokemon foundPokemon = getPokemonById(id);
                    if (foundPokemon != null) {
                        JOptionPane.showMessageDialog(null, "Pokémon encontrado:\n" + foundPokemon);
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontró ningún Pokémon con ese ID.");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.");
                }
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(showButton);
        buttonPanel.add(searchButton);
        buttonPanel.add(exitButton);

        // Usar el JScrollPane en lugar del JTextArea directamente
        add(scrollPane, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        setTitle("Pokedex");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void addPokemon(Pokemon pokemon) {
        pokemonList.add(pokemon);
    }

    public Pokemon getPokemonById(int id) {
        for (Pokemon pokemon : pokemonList) {
            if (pokemon.id == id) {
                return pokemon;
            }
        }
        return null;
    }

    public void displayPokedex() {
        StringBuilder stringBuilder = new StringBuilder("Pokedex:\n");
        for (Pokemon pokemon : pokemonList) {
            stringBuilder.append(pokemon).append("\n");
        }
        displayArea.setText(stringBuilder.toString());
    }

    public static void main(String[] args) {
        Pokedex pokedex = new Pokedex();
//  pokedex.addPokemon(new Pokemon());
        // Agregar algunos Pokémon a la Pokedex
        pokedex.addPokemon(new Pokemon("Bulbasaur", 1, "Grass/Poison", 45, 49, 49, 45, 65, 253));
        pokedex.addPokemon(new Pokemon("Ivysaur", 2, "Planta / Veneno", 60, 62, 63, 60, 80, 325));
        pokedex.addPokemon(new Pokemon("Venusaur", 3, "Planta / Veneno", 80, 82, 83, 80, 100, 425));
        pokedex.addPokemon(new Pokemon("Charmander", 4, "Fuego", 39, 52, 43, 65, 50, 249));
        pokedex.addPokemon(new Pokemon("Charmaleon", 5, "Fuego", 58, 64, 58, 80, 65, 325));
        pokedex.addPokemon(new Pokemon("Charizard", 6, "Fuego/ Volador", 78, 84, 78, 100, 85,425));
        pokedex.addPokemon(new Pokemon("Squirtle", 7, "Agua", 44, 48, 65, 43, 50, 250));
        pokedex.addPokemon(new Pokemon("Wartortie", 8 , "Agua", 59, 63, 80, 58, 65, 325));
        pokedex.addPokemon(new Pokemon("Blastoise", 9, "Agua",79, 83, 100, 78,85, 425));
        pokedex.addPokemon(new Pokemon("Cartipie" , 10, "Bicho", 45, 30, 35, 45, 20, 175));
        pokedex.addPokemon(new Pokemon("Metapod", 11, "Bicho", 50, 20, 55, 30, 25, 180));
        pokedex.addPokemon(new Pokemon("Butterfree", 12, "Bicho/Volador", 60,45,50,70,80,305));
        pokedex.addPokemon(new Pokemon("Weedie", 13, "Bicho/ Veneno", 40,35,30,50,20,175));
        pokedex.addPokemon(new Pokemon("Kakuna" , 14, "Bicho/Veneno", 45,25,50,35,25,180));
        pokedex.addPokemon(new Pokemon("Beedrill", 15, "Bicho/Veneno", 65,80,40,75,45,305));
        pokedex.addPokemon(new Pokemon("Pidgey", 16, "Normal,Volador", 40,45,40,56,35,216));
        pokedex.addPokemon(new Pokemon("Pidgeotto", 17, "Normal/Volador", 63,60,55,71,50,299));
        pokedex.addPokemon(new Pokemon("Pidgeot", 18, "Normal/ Voaldor", 83,80,75,91,70,399));
        pokedex.addPokemon(new Pokemon("Rattata", 19, "Normal",30,56,35,72,25,219));
        pokedex.addPokemon(new Pokemon("Raticate", 20, "Normal",55,81,60,97,50,345));
        pokedex.addPokemon(new Pokemon("Spearow", 21 , "Normal/Volador", 40,60,30,70,31,231));
        pokedex.addPokemon(new Pokemon("Fearow", 22,  "Volador/NOrmal", 65,90,65,100,61,381));
        pokedex.addPokemon(new Pokemon("Ekans", 23 ,"Veneno", 35,60,44,55,40,234));
        pokedex.addPokemon(new Pokemon("Arbok", 24, "Veneno", 60,85,69,80,65,359));
        pokedex.addPokemon(new Pokemon("Pikachu", 25, "Electrico", 35,55,30,90,50,260));
        pokedex.addPokemon(new Pokemon("Raicho", 26,"Electrico", 60,90,55,100,90,395));
        pokedex.addPokemon(new Pokemon("Sandshrew", 27, "Tierra",50,75,85,40,30,280));
        pokedex.addPokemon(new Pokemon("Sandslash", 28, "Tierra",75,100,110,65,55,405));
        pokedex.addPokemon(new Pokemon("NIdoran", 29, "Veneno", 55,47,52,41,40,235 ));
        pokedex.addPokemon(new Pokemon("Nidorina", 30, "Veneno", 70,62,67,56,55,310));
        pokedex.addPokemon(new Pokemon("Nidoqueen", 31, "Veneno/Tierra", 90,82,87,76,75,410));
        pokedex.addPokemon(new Pokemon("Nidora", 32, "Veneno", 46,57,40,50,40,233));
        pokedex.addPokemon(new Pokemon("NIdorino", 33, "Veneno", 61,72,57,65,55,310));
        pokedex.addPokemon(new Pokemon("Nidoking", 34, "Veneno/Tierra", 81,92,77,85,75,410));
        pokedex.addPokemon(new Pokemon("Clefairy", 35, "Hada", 70,45,48,35,60,258));
        pokedex.addPokemon(new Pokemon("Clafable", 36, "Hada", 95,70,73,60,85,383));
        pokedex.addPokemon(new Pokemon("Vulpix", 37, "Hada", 38,41,40,65,65,249));
        pokedex.addPokemon(new Pokemon("Ninetales",38 ,"Fuego", 73, 76, 75, 100, 100, 424));
        pokedex.addPokemon(new Pokemon( "Jigglypuff",39 ,"Normal/Hada", 115, 45, 20, 20, 25, 225));
        pokedex.addPokemon(new Pokemon("Wigglytuff",40 ,"Normal/Hada", 140, 70, 45, 45, 50, 350));
        pokedex.addPokemon(new Pokemon("Zubat",41 ,"Veneno/Volador", 40, 45, 35, 55, 40, 215));
        pokedex.addPokemon(new Pokemon( "Golbat", 42,"Veneno/Volador", 75, 80, 70, 90, 75, 390));
        pokedex.addPokemon(new Pokemon("Oddish",43 ,"Planta/Veneno", 45, 50, 55, 30, 75, 255));
        pokedex.addPokemon(new Pokemon("Gloom",44 ,"Planta/Veneno", 60, 65, 70, 40, 85, 320));
        pokedex.addPokemon(new Pokemon("Vileplume", 45,"Planta/Veneno", 75, 80, 85, 50, 100, 390));
        pokedex.addPokemon(new Pokemon("Paras", 46,"Bicho/Planta", 35, 70, 55, 25, 55, 240));
        pokedex.addPokemon(new Pokemon( "Parasect",47 ,"Bicho/Planta", 60, 95, 80, 30, 80, 345));
        pokedex.addPokemon(new Pokemon( "Venonat",48 ,"Bicho/Veneno", 60, 55, 50, 45, 40, 250));
        pokedex.addPokemon(new Pokemon("Venomoth",49 ,"Bicho/Veneno", 70, 65, 60, 90, 90, 375));
        pokedex.addPokemon(new Pokemon("Diglett", 50,"Tierra", 10, 55, 25, 95, 45, 230));
        pokedex.addPokemon(new Pokemon( "Dugtrio",51 ,"Tierra", 35, 80, 50, 120, 70, 355));
        pokedex.addPokemon(new Pokemon("Meowth",52, "Normal", 40, 45, 35, 90, 40, 250));
        pokedex.addPokemon(new Pokemon("Persian",53 ,"Normal", 65, 70, 60, 115, 65, 375));
        pokedex.addPokemon(new Pokemon("Psyduck",54 ,"Agua", 50, 52, 48, 55, 50, 255));
        pokedex.addPokemon(new Pokemon("Golduck",55 ,"Agua", 80, 82, 78, 85, 80, 405));
        pokedex.addPokemon(new Pokemon("Mankey",56, "Lucha", 40, 80, 35, 70, 35, 260));
        pokedex.addPokemon(new Pokemon("Primeape", 57,"Lucha", 65, 105, 60, 95, 60, 385));
        pokedex.addPokemon(new Pokemon("Growlithe",58, "Fuego", 55, 70, 45, 60, 50, 280));
        pokedex.addPokemon(new Pokemon("Arcanine",59, "Fuego", 90, 110, 80, 95, 80, 455));
        pokedex.addPokemon(new Pokemon("Poliwag",60, "Agua", 40, 50, 40, 90, 40, 260));
        pokedex.addPokemon(new Pokemon("Poliwhirl",61, "Agua", 65, 65, 65, 90, 50, 335));
        pokedex.addPokemon(new Pokemon( "Poliwrath",62, "Agua/Lucha", 90, 85, 95, 70, 70, 410));
        pokedex.addPokemon(new Pokemon("Abra",63, "Psíquico", 25, 20, 15, 90, 105, 255));
        pokedex.addPokemon(new Pokemon("Kadabra",64,  "Psíquico", 40, 35, 30, 105, 120, 330));
        pokedex.addPokemon(new Pokemon("Alakazam",65, "Psíquico", 55, 50, 45, 120, 135, 405));
        pokedex.addPokemon(new Pokemon("Machop",66, "Lucha", 70, 80, 50, 35, 35, 270));
        pokedex.addPokemon(new Pokemon( "Machoke",67, "Lucha", 80, 100, 70, 45, 50, 345));
        pokedex.addPokemon(new Pokemon( "Machamp",68, "Lucha", 90, 130, 80, 55, 65, 410));
        pokedex.addPokemon(new Pokemon("Bellsprout",69, "Planta/Veneno", 50, 75, 35, 40, 70, 270));
        pokedex.addPokemon(new Pokemon( "Weepinbell",70, "lanta/Veneno", 65, 90, 50, 55, 85, 355));
        pokedex.addPokemon(new Pokemon( "Victreebel",71, "Planta/Veneno", 80, 105, 65, 70, 100, 420));
        pokedex.addPokemon(new Pokemon("Tentacool", 72,"Agua/Veneno", 40, 40, 35, 70, 100, 285));
        pokedex.addPokemon(new Pokemon("Tentacruel",73, "Agua/Veneno", 80, 70, 65, 100, 120, 435));
        pokedex.addPokemon(new Pokemon("Goude", 74, "Roca/Tierra", 40,80,100,20,30,270));
        pokedex.addPokemon(new Pokemon("Rapidash" ,75 , "Fuego" ,65, 100, 70, 105, 80, 420));
        pokedex.addPokemon(new Pokemon("Slowpoke", 76 ,"Agua/Psíquico" , 90, 65, 65, 15, 40, 275));
        pokedex.addPokemon(new Pokemon("Slowbro" ,77 , "Agua/Psíquico" ,95, 75, 110, 30, 80, 390));
       pokedex.addPokemon(new Pokemon("Magnemite", 78 , "Eléctrico/Acero" , 25, 35, 70, 45, 95, 270));
        pokedex.addPokemon(new Pokemon("Magneto" ,79 , "Eléctrico/Acero", 50, 60, 95, 70, 120, 395));
        pokedex.addPokemon(new Pokemon("Farfetch'd", 80 , "Normal/Volador" , 52, 65, 55, 60, 58, 290));
        pokedex.addPokemon(new Pokemon("Doduo ",81 ,"Normal/Volador" ,35, 85, 45, 75, 35, 275));
        pokedex.addPokemon(new Pokemon("Dodrio", 82 , "Normal/Volador" , 60, 110, 70, 100, 60, 400));
        pokedex.addPokemon(new Pokemon("Seel ",83 ,"Agua" , 65, 45, 55, 45, 70, 280));
        pokedex.addPokemon(new Pokemon("Dewgong", 84 , "Agua/Hielo" , 90, 70, 80, 70, 95, 405));
        pokedex.addPokemon(new Pokemon("Grimer" ,85 ,"Veneno ", 80, 80, 50, 25, 40, 275));
        pokedex.addPokemon(new Pokemon("Muk" ,86 ,"Veneno ", 105, 105, 75, 50, 65, 400));
        pokedex.addPokemon(new Pokemon("Shellder", 87,"Agua" , 30, 65, 100, 40, 45, 280));
        pokedex.addPokemon(new Pokemon("Cloyster", 88 , "Agua/Hielo" , 50, 95, 180, 70, 85, 480));
        pokedex.addPokemon(new Pokemon("Gastly" ,89 ,"Fantasma/Veneno" , 30, 35, 30, 80, 100, 275));
        pokedex.addPokemon(new Pokemon("Haunter", 90 ,"Fantasma/Veneno" , 45, 50, 45, 95, 115, 350));
        pokedex.addPokemon(new Pokemon("Gengar ",91 ,"Fantasma/Veneno" , 60, 65, 60, 110, 130, 425));
        pokedex.addPokemon(new Pokemon("Onix ",92, "Roca/Tierra" ,35, 45, 160, 70, 30, 340));
        pokedex.addPokemon(new Pokemon("Drowzee", 93, "Psíquico" , 60, 48, 45, 42, 90, 285));
        pokedex.addPokemon(new Pokemon("Hypno", 94 ,"Psíquico" , 85, 73, 70, 67, 115, 410));
        pokedex.addPokemon(new Pokemon("Krabby" ,95, "Agua" ,30, 105, 90, 50, 25, 300));
        pokedex.addPokemon(new Pokemon("Kingler" ,96 ,"Agua" , 55, 130, 115, 75, 50, 425));
        pokedex.addPokemon(new Pokemon("Voltorb" ,97 , "Eléctrico" , 40, 30, 50, 100, 55, 275));
        pokedex.addPokemon(new Pokemon("Electrode" ,98 , "Eléctrico" , 60, 50, 70, 140, 80, 400));
        pokedex.addPokemon(new Pokemon("Exeggcute ",99 , "Planta/Psíquico" , 60, 40, 80, 40, 60, 280));
        pokedex.addPokemon(new Pokemon("Exeggutor ",100 , "Planta/Psíquico" , 95, 95, 85, 55, 125, 455));
        pokedex.addPokemon(new Pokemon("Cubone " ,101 ,"Tierra" , 50, 50, 95, 35, 40, 270));
        pokedex.addPokemon(new Pokemon("Marowak ",102, "Tierra" , 60, 80, 110, 45, 50, 345));
        pokedex.addPokemon(new Pokemon("Hitmonlee ",103 ,"Lucha" , 50, 120, 53, 87, 35, 345));
        pokedex.addPokemon(new Pokemon("Hitmonchan ",104,"Lucha" , 50, 105, 79, 76, 35, 345));
        pokedex.addPokemon(new Pokemon("Lickitung ",105 , "Normal" , 90, 55, 75, 30, 60, 310));
        pokedex.addPokemon(new Pokemon("Koffing" ,106 ,"Veneno" , 40, 65, 95, 35, 60, 295));
        pokedex.addPokemon(new Pokemon("Weezing ",107,"Veneno" ,65, 90, 120, 60, 85, 420));
        pokedex.addPokemon(new Pokemon("Rhyhorn",108,"Tierra/Roca",80,85,95,25,30,315));
        pokedex.addPokemon(new Pokemon("Weezing ",110 , "Veneno" , 65, 90, 120, 60, 85, 420));
        pokedex.addPokemon(new Pokemon("Rhyhorn ",111 ,"Tierra/Roca" ,80, 85, 95, 25, 30, 315));
        pokedex.addPokemon(new Pokemon("Rhydon ",112 ,"Tierra/Roca" ,105, 130, 120, 40, 45, 440));
        pokedex.addPokemon(new Pokemon("Chansey" ,113 ,"Normal ",250, 5, 5, 50, 105, 415));
        pokedex.addPokemon(new Pokemon("Tangela" ,113 , "Planta", 65, 55, 115, 60, 100, 395));
        pokedex.addPokemon(new Pokemon("Kangaskhan ",114 ,"Normal", 105, 95, 80, 90, 40, 410));
        pokedex.addPokemon(new Pokemon("Horsea ",115, "Agua ",30, 40, 70, 60, 70, 270));
        pokedex.addPokemon(new Pokemon("Seadra ",116 , "Agua", 55, 65, 95, 85, 95, 395));
        pokedex.addPokemon(new Pokemon("Goldeen" ,117 , "Agua",45, 67, 60, 63, 50, 285));
        pokedex.addPokemon(new Pokemon("Seaking ",118 ,"Agua" ,80, 92, 65, 68, 80, 385));
        pokedex.addPokemon(new Pokemon("Staryu" ,119, "Agua ", 30, 45, 55, 85, 70, 285));
        pokedex.addPokemon(new Pokemon("Starmie", 120 , "Agua/Psíquico", 60, 75, 85, 115, 100, 435));
        pokedex.addPokemon(new Pokemon("Mr. Mime", 121 ,"Psíquico/Hada" , 40, 45, 65, 90, 100, 340));
        pokedex.addPokemon(new Pokemon("Scyther" ,122 , "Bicho/Volador" , 70, 110, 80, 105, 55, 420));
        pokedex.addPokemon(new Pokemon("Jynx", 123 , "Hielo/Psíquico" ,65, 50, 35, 95, 95, 340));
        pokedex.addPokemon(new Pokemon("Electabuzz", 124 , "Eléctrico" ,65, 83, 57, 105, 85, 395));
        pokedex.addPokemon(new Pokemon("Magmar" ,125, "Fuego", 65, 95, 57, 93, 85, 395));
        pokedex.addPokemon(new Pokemon("Pinsir" ,126 , "Bicho" , 65, 125, 100, 85, 55, 430));
        pokedex.addPokemon(new Pokemon("Tauros", 127 , "Normal", 75, 100, 95, 110, 70, 450));
        pokedex.addPokemon(new Pokemon("Magikarp ",128 , "Agua" , 20, 10, 55, 80, 20, 185));
        pokedex.addPokemon(new Pokemon("Gyarados", 129 , "Agua/Volador" ,95, 125, 79, 81, 100, 480));
        pokedex.addPokemon(new Pokemon("Lapras ",130 , "Agua/Hielo" , 130, 85, 80, 60, 95, 450));
        pokedex.addPokemon(new Pokemon("Ditto ",131 , "Normal" ,48, 48, 48, 48, 48, 240));
        pokedex.addPokemon(new Pokemon("Eevee ",132 , "Normal" , 55, 55, 50, 55, 65, 280));
        pokedex.addPokemon(new Pokemon("Vaporeon" ,133, "Agua" , 130, 65, 60, 65, 110, 430));
        pokedex.addPokemon(new Pokemon("Jolteon ",134 , "Eléctrico" , 65, 65, 60, 110, 95, 395));
        pokedex.addPokemon(new Pokemon("Flareon ",135 , "Fuego" ,65, 130, 60, 65, 110, 430));
        pokedex.addPokemon(new Pokemon("Porygon ",137 , "Normal" ,65, 60, 70, 40, 75, 310));
        pokedex.addPokemon(new Pokemon("Omanyte ",138 , "Roca/Agua" , 35, 40, 100, 35, 90, 300));
        pokedex.addPokemon(new Pokemon("Omastar", 139 , "Roca/Agua" , 70, 60, 125, 55, 115, 425));
        pokedex.addPokemon(new Pokemon("Kabuto ",140 , "Roca/Agua" , 30, 80, 90, 55, 45, 300));
        pokedex.addPokemon(new Pokemon("Kabutops ",141 , "Roca/Agua" , 60, 115, 105, 80, 70, 430));
        pokedex.addPokemon(new Pokemon("Aerodactyl", 142 , "Roca/Volador" , 80, 105, 65, 130, 75, 455));
        pokedex.addPokemon(new Pokemon("Snorlax ",143 , "Normal" , 160, 110, 65, 30, 65, 430));
        pokedex.addPokemon(new Pokemon("Articuno" ,144 , "Hielo/Volador" , 90, 85, 100, 85, 125, 485));
        pokedex.addPokemon(new Pokemon("Zapdos ",145 , "Eléctrico/Volador" , 90, 90, 85, 100, 125, 490));
        pokedex.addPokemon(new Pokemon("Moltres ",146 , "Fuego/Volador" , 90, 100, 90, 90, 125, 495));
        pokedex.addPokemon(new Pokemon("Dratini", 147 , "Dragón" ,41, 64, 45, 50, 50, 250));
        pokedex.addPokemon(new Pokemon("Dragonair" ,148 , "Dragón ", 61, 84, 65, 70, 70, 350));
        pokedex.addPokemon(new Pokemon("Dragonite", 149 , "Dragón/Volador ", 91, 134, 95, 80, 100, 500));
        pokedex.addPokemon(new Pokemon("Mewtwo", 150 , "Psíquico" , 106, 110, 90, 130, 154, 590));
        pokedex.addPokemon(new Pokemon("Mew", 151, "Psiquico", 100,100,100,100,100,500));
        
    }
}