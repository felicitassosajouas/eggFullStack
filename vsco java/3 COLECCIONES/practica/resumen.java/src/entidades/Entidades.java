package entidades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;

public class Entidades {
    ArrayList <Integer> numeros = new ArrayList<>();
    LinkedList <Integer> num = new LinkedList<>();
    
    HashSet <String> nombres = new HashSet<>();
    TreeSet <Integer> edades = new TreeSet<>();
    LinkedHashSet <String> names = new LinkedHashSet<>();

    HashMap <Integer,String> dniNombre = new HashMap<>();
    TreeMap <Integer,String> edadNombre = new TreeMap <>();
    LinkedHashMap <Integer, String> llegadaNombre = new LinkedHashMap <>();
}