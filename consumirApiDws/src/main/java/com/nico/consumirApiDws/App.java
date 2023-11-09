package com.nico.consumirApiDws;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import dtos.*;

public class App {
	public static void main(String[] args) {

		try {
			// Hacer una solicitud HTTP a la API de usuarios
			URI uriUsuarios = new URI("http://localhost:8080/usuarios/todos");
			HttpURLConnection conn = (HttpURLConnection) uriUsuarios.toURL().openConnection();
			conn.setRequestMethod("GET");
			conn.connect();

			// Obtener la respuesta JSON de la API de usuarios
			int responseCode = conn.getResponseCode();
			String response = "";
			if (responseCode == HttpURLConnection.HTTP_OK) {
				Scanner scanner = new Scanner(conn.getInputStream());
				while (scanner.hasNextLine()) {
					response += scanner.nextLine();
				}
				scanner.close();
			}

			// Convertir la respuesta JSON en objetos Java usando Jackson
			ObjectMapper mapper = new ObjectMapper();
			List<Usuario> usuarios = mapper.readValue(response, new TypeReference<List<Usuario>>() {});

			//Mostramos los usuarios
			for (Usuario usuario : usuarios) {
				JOptionPane.showMessageDialog(null, usuario.toString());
			}

			// Hacer una solicitud HTTP a la API de accesos
			URI uriAccesos = new URI("http://localhost:8080/accesos/todos");
			conn = (HttpURLConnection) uriAccesos.toURL().openConnection();
			conn.setRequestMethod("GET");
			conn.connect();

			// Obtener la respuesta JSON de la API de accesos
			responseCode = conn.getResponseCode();
			response = "";
			if (responseCode == HttpURLConnection.HTTP_OK) {
				Scanner scanner = new Scanner(conn.getInputStream());
				while (scanner.hasNextLine()) {
					response += scanner.nextLine();
				}
				scanner.close();
			}

			// Convertir la respuesta JSON en objetos Java usando Jackson
			List<Acceso> accesos = mapper.readValue(response, new TypeReference<List<Acceso>>() {});

			//Mostramos accesos
			for (Acceso acceso : accesos) {
				JOptionPane.showMessageDialog(null, acceso.toString());
			}

		} catch (IOException | URISyntaxException e) {
			e.printStackTrace();
		}

	}
}
