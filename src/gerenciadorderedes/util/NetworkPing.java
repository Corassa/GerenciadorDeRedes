/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciadorderedes.util;

import java.io.IOException;
import java.net.InetAddress;

public class NetworkPing {
    public static void main(String[] args) throws IOException {

        InetAddress localhost = InetAddress.getLocalHost();
        // uso de IPv4 e assumido!
        byte[] ip = localhost.getAddress();

        for (int i = 1; i <= 254; i++) {
            ip[3] = (byte) i;
            InetAddress address = InetAddress.getByAddress(ip);
            if (address.isReachable(1000)) {
                System.out.println(address + " maquina esta ligada e pode ser pingada");
            } else if (!address.getHostAddress().equals(address.getHostName())) {
                System.out.println(address + " maquina reconhecida por um DNSLookup");
            } else {
                System.out.println(address + " o endereço de host e o nome do host são iguais, o host name não pode ser resolvido.");
            }
        }

    }
}