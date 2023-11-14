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
    int id;
    String type;

    public Pokemon(String name, int id, String type) {
        this.name = name;
        this.id = id;
        this.type = type;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Type: " + type;
    }
}

public class Pokedex extends JFrame {
    private ArrayList<Pokemon> pokemonList;
    private JTextArea displayArea;

    public Pokedex() {
        pokemonList = new ArrayList<>();
        displayArea = new JTextArea(10, 40);
        displayArea.setEditable(false);

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

        add(displayArea, BorderLayout.CENTER);
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

        // Agregar algunos Pokémon a la Pokedex
        pokedex.addPokemon(new Pokemon("Bulbasaur", 1, "Grass/Poison"));
        pokedex.addPokemon(new Pokemon("Charmander", 4, "Fire"));
        pokedex.addPokemon(new Pokemon("Squirtle", 7, "Water"));
    }
}