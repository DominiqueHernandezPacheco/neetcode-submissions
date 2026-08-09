class Solution {
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        String cadena;

        for (String str : strs) {
            sb.append(str.length());
            sb.append('#');
            sb.append(str);
        }
        cadena = sb.toString();
        return cadena;
    }

    public List<String> decode(String str) {
        String cadena = str;
        int i = 0;
        int j = 0;
        List<String> decoded = new ArrayList<>();

        while (j < cadena.length()) {
            if (cadena.charAt(j) != '#') {
                j++;
            } else {
                int ciclado = Integer.parseInt(cadena.substring(i, j));
                String palabra = cadena.substring(j + 1, j + 1 + ciclado);
                decoded.add(palabra);
                i = j + 1 + ciclado;
                j = i + 1;
            }
        }
        return decoded;
    }
}
