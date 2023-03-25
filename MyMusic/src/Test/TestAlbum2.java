package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import uaemex.DTO.Album;
import uaemex.DTO.Artistas;
import uaemex.DTO.Cancion;
import uaemex.DTO.Grupos;
import uaemex.DTO.Persona;

public class TestAlbum2 {

	public static void main(String[] args) {

		Scanner Leer = new Scanner(System.in);

		int opcion = 0;

		while (opcion != 5) {

			System.out.println("¿Que quieres realizar?");
			System.out.println("1. Ver Album 1");
			System.out.println("2. Ver Album 1");
			System.out.println("3. Ver Album 1");
			System.out.println("4. Ver Album 2");
			System.out.println("5. Salir");

			System.out.print("Seleccione una opción: ");
			opcion = Leer.nextInt();

			switch (opcion) {

			case 1 -> {

				Persona identidad1 = new Persona();

				identidad1.setId(1);
				identidad1.setNombre("Alok Achkar");
				identidad1.setApellido("Peres Petrillo");
				identidad1.setF_nacimiento(2023 - 1991);
				identidad1.setGenero("Masculino");
				identidad1.setNacionalidad("Brasileña");
				
				List<Persona> listapersona = new ArrayList<>();
				listapersona.add(identidad1);

				Artistas artista1 = new Artistas();

				artista1.setId(1);
				artista1.setNombre("Alok");
				artista1.setOcupacion("DJ, compositor y productor discográfico");
				
				List<Artistas> listaArtistas = new ArrayList<>();
				listaArtistas.add(artista1);

				Cancion cancion1 = new Cancion();

				cancion1.setId(1);
				cancion1.setNombre("Vale Vale");
				cancion1.setGenero("Dance/Electrónica");

				Cancion cancion2 = new Cancion();

				cancion2.setId(1);
				cancion2.setNombre("Killed By The City");
				cancion2.setGenero("Dance/Electrónica");

				List<Cancion> listacanciones = new ArrayList<>();
				listacanciones.add(cancion1);
				listacanciones.add(cancion2);

				Album Album1 = new Album();
				// Date fechaIni = new Date();
				Album1.setId(1);
				Album1.setCanciones(listacanciones);
				Album1.setIntegrantes(listaArtistas);
				Album1.setIdentidades(listapersona);
				Album1.setNombre("independientes");
				
				TestAlbum test1 = new TestAlbum();
				
				test1.testCrearPersona(identidad1);
				test1.testCrearArtista(artista1);
				test1.testCrearCancion(cancion1);
				test1.testCrearCancion(cancion2);
				test1.testCrearAlbum(Album1);

				test1.consultarTodos();
				test1.consultarAlbum();

			}

			case 2 -> {
				Persona identidad2 = new Persona();

				identidad2.setId(1);
				identidad2.setNombre("lan Olav");
				identidad2.setApellido("Walker");
				identidad2.setF_nacimiento(2023 - 1997);
				identidad2.setGenero("Masculino");
				identidad2.setNacionalidad("Noruga");
				
				List<Persona> listapersona = new ArrayList<>();
				listapersona.add(identidad2);

				Artistas artista2 = new Artistas();

				artista2.setId(1);
				artista2.setNombre("Alan Walker");
				artista2.setOcupacion("	DJ, compositor y productor");
				
				List<Artistas> listaArtistas = new ArrayList<>();
				listaArtistas.add(artista2);

				Cancion cancion3 = new Cancion();

				cancion3.setId(1);
				cancion3.setNombre("Man On The Moon");
				cancion3.setGenero("Alternativa/independiente, Dance/Electrónica, Pop");

				Cancion cancion4 = new Cancion();

				cancion4.setId(1);
				cancion4.setNombre("Out of Love");
				cancion4.setGenero("Alternativa/independiente, Dance/Electrónica, Pop");

				List<Cancion> listacanciones = new ArrayList<>();
				listacanciones.add(cancion3);
				listacanciones.add(cancion4);

				Album Album2 = new Album();
				// Date fechaIni = new Date();
				Album2.setId(1);
				Album2.setCanciones(listacanciones);
				Album2.setIntegrantes(listaArtistas);
				Album2.setIdentidades(listapersona);
				Album2.setNombre("World Of Walker");
				
				TestAlbum test1 = new TestAlbum();
				
				test1.testCrearPersona(identidad2);
				test1.testCrearArtista(artista2);
				test1.testCrearCancion(cancion3);
				test1.testCrearCancion(cancion4);
				test1.testCrearAlbum(Album2);

				test1.consultarTodos();
				test1.consultarAlbum();

			}
			case 3 -> {
				
				Grupos  grupo1 = new  Grupos ();

				grupo1 . setId ( 4 );
				grupo1 . setNombre( "Imaginedragons" );
				grupo1 . setF_Fundacion(2023-2008);
				grupo1 . setNacionalidad( "Las Vegas, Nevada, Estados Unidos" );
				
				Persona IdentidadIn = new Persona();
				
				IdentidadIn.setId(2);
				IdentidadIn.setNacionalidad("Estadounidense");
				IdentidadIn.setNombre("Daniel");
				IdentidadIn.setApellido("Coulter Reynolds");
				IdentidadIn.setF_nacimiento(2023 - 1987);
				IdentidadIn.setGenero("Masculino");
				
				Persona IdentidadIn2 = new Persona();
				
				IdentidadIn2.setId(2);
				IdentidadIn2.setNacionalidad("Estadounidense");
				IdentidadIn2.setNombre("Daniel");
				IdentidadIn2.setApellido("Wayne Sermon");
				IdentidadIn2.setF_nacimiento(2023 - 1984);
				IdentidadIn2.setGenero("Masculino");
				
				Persona IdentidadIn3 = new Persona();
				
				IdentidadIn3.setId(2);
				IdentidadIn3.setNacionalidad("Estadounidense");
				IdentidadIn3.setNombre("Benjamin Arthur");
				IdentidadIn3.setApellido("McKee");
				IdentidadIn3.setF_nacimiento(2023 - 1985);
				IdentidadIn3.setGenero("Masculino");
				
				Persona IdentidadIn4 = new Persona();
				
				IdentidadIn4.setId(2);
				IdentidadIn4.setNacionalidad("Estadounidense");
				IdentidadIn4.setNombre("Daniel James");
				IdentidadIn4.setApellido("Platzman");
				IdentidadIn4.setF_nacimiento(2023 - 1986);
				IdentidadIn4.setGenero("Masculino");
				
				List<Persona> listapersona = new ArrayList<>();
				listapersona.add(IdentidadIn);
				listapersona.add(IdentidadIn2);
				listapersona.add(IdentidadIn3);
				listapersona.add(IdentidadIn4);

				Artistas  Integrante1 = new  Artistas ();

				Integrante1 . setId ( 2 );
				Integrante1 . setNombre ( "Dan Reynolds" );
				Integrante1 . setOcupacion ( "Cantante, compositor, músico" );

				Artistas  Integrante2 = new  Artistas ();

				Integrante2 . setId ( 2 );
				Integrante2 . setNombre ( "Wayne Sermon" );
				Integrante2 . setOcupacion ( "músico" );
				
				Artistas  Integrante3 = new  Artistas ();

				Integrante3 . setId ( 2 );
				Integrante3 . setNombre ( "Ben McKee" );
				Integrante3 . setOcupacion ( "Bajista, músico" );
				
				Artistas  Integrante4 = new  Artistas ();

				Integrante4 . setId ( 2 );
				Integrante4 . setNombre ( "Daniel Platzman" );
				Integrante4 . setOcupacion ( "Baterista, músico y compositor de cine." );
				
				
				List<Artistas> listaArtistas = new ArrayList<>();
				listaArtistas.add(Integrante1);
				listaArtistas.add(Integrante2);
				listaArtistas.add(Integrante3);
				listaArtistas.add(Integrante4);

				Cancion cancion5 = new Cancion();

				cancion5.setId(1);
				cancion5.setNombre("Bones");
				cancion5.setGenero("Rock, Alternativa/independiente, Música infantil");

				Cancion cancion6 = new Cancion();

				cancion6.setId(2);
				cancion6.setNombre("Enemy");
				cancion6.setGenero("R&B/Soul, Alternativa/independiente, Hip-hop/rap");

				List<Cancion> listacanciones = new ArrayList<>();
				listacanciones.add(cancion5);
				listacanciones.add(cancion6);

				Album Album3 = new Album();
				// Date fechaIni = new Date();
				Album3.setId(1);
				Album3.setCanciones(listacanciones);
				Album3.setIntegrantes(listaArtistas);
				Album3.setIdentidades(listapersona);
				Album3.setNombre("Mercury – Act 2 (Mercury – Acts 1 & 2");
				
				TestAlbum test1 = new TestAlbum();
				
				test1.testCrearPersona(IdentidadIn);
				test1.testCrearPersona(IdentidadIn2);
				test1.testCrearPersona(IdentidadIn3);
				test1.testCrearPersona(IdentidadIn4);
				test1.testCrearArtista(Integrante1);
				test1.testCrearArtista(Integrante2);
				test1.testCrearArtista(Integrante3);
				test1.testCrearArtista(Integrante4);
				test1.testCrearCancion(cancion5);
				test1.testCrearCancion(cancion6);
				test1.testCrearAlbum(Album3);

				test1.consultarTodos();
				test1.consultarAlbum();
				
			}
			case 4 -> {
				Grupos  grupo2 = new  Grupos ();

				grupo2 . setId ( 4 );
				grupo2 . setNombre( "Kana-Boon" );
				grupo2 . setF_Fundacion(2023-2006);
				grupo2 . setNacionalidad( "Osaka, Japón" );
				
				Persona IdentidadInt = new Persona();
				
				IdentidadInt.setId(2);
				IdentidadInt.setNacionalidad("Sakai, Osaka, Japón");
				IdentidadInt.setNombre("Maguro");
				IdentidadInt.setApellido("Taniguch");
				IdentidadInt.setF_nacimiento(2023 - 1990);
				IdentidadInt.setGenero("Masculino");
				
				Persona IdentidadInt2 = new Persona();
				
				IdentidadInt2.setId(2);
				IdentidadInt2.setNacionalidad(" Nagasaki, Japón");
				IdentidadInt2.setNombre("Hayato");
				IdentidadInt2.setApellido("Koga");
				IdentidadInt2.setF_nacimiento(2023 - 1984);
				IdentidadInt2.setGenero("Masculino");
				
				Persona IdentidadInt3 = new Persona();
				
				IdentidadInt3.setId(2);
				IdentidadInt3.setNacionalidad("Osaka, Japon");
				IdentidadInt3.setNombre("Yuuma");
				IdentidadInt3.setApellido("Meshida");
				IdentidadInt3.setF_nacimiento(2023 - 1990);
				IdentidadInt3.setGenero("Masculino");
				
				Persona IdentidadInt4 = new Persona();
				
				IdentidadInt4.setId(2);
				IdentidadInt4.setNacionalidad(" Osaka, Japón");
				IdentidadInt4.setNombre("Takahiro");
				IdentidadInt4.setApellido("Koizumi");
				IdentidadInt4.setF_nacimiento(2023 - 1991);
				IdentidadInt4.setGenero("Masculino");
				
				List<Persona> listaPersona = new ArrayList<>();
				listaPersona.add(IdentidadInt);
				listaPersona.add(IdentidadInt2);
				listaPersona.add(IdentidadInt3);
				listaPersona.add(IdentidadInt4);

				Artistas  Integrantes1 = new  Artistas ();

				Integrantes1 . setId ( 2 );
				Integrantes1 . setNombre ( "Maguro Taniguchi" );
				Integrantes1 . setOcupacion ( "Cantante, guitarrista, compositor" );

				Artistas  Integrantes2 = new  Artistas ();

				Integrantes2 . setId ( 2 );
				Integrantes2 . setNombre ( "Hayato Koga" );
				Integrantes2 . setOcupacion ( "Guitarrista" );
				
				Artistas  Integrantes3 = new  Artistas ();

				Integrantes3 . setId ( 2 );
				Integrantes3 . setNombre ( "Yuuma Meshida" );
				Integrantes3 . setOcupacion ( "Bajista" );
				
				Artistas  Integrantes4 = new  Artistas ();

				Integrantes4 . setId ( 2 );
				Integrantes4 . setNombre ( "Takahiro Koizumi" );
				Integrantes4 . setOcupacion ( " Baterista" );
				
				
				List<Artistas> listaArtistas = new ArrayList<>();
				listaArtistas.add(Integrantes1);
				listaArtistas.add(Integrantes2);
				listaArtistas.add(Integrantes3);
				listaArtistas.add(Integrantes4);

				Cancion canciones = new Cancion();

				canciones.setId(1);
				canciones.setNombre("Fighter");
				canciones.setGenero("Rock Alternativo, Pop rock, Metal alternativo, Hard rock, Grunge");

				Cancion canciones2 = new Cancion();

				canciones2.setId(2);
				canciones2.setNombre("Torch of Liberty");
				canciones2.setGenero("Japanese Rock, Japanese Indie,Rock, J-Pop");

				List<Cancion> listacanciones = new ArrayList<>();
				listacanciones.add(canciones);
				listacanciones.add(canciones2);

				Album Album4 = new Album();
				// Date fechaIni = new Date();
				Album4.setId(1);
				Album4.setCanciones(listacanciones);
				Album4.setIntegrantes(listaArtistas);
				Album4.setIdentidades(listaPersona);
				Album4.setNombre(" Música de anime japonesa");
				
				TestAlbum test1 = new TestAlbum();
				
				test1.testCrearPersona(IdentidadInt);
				test1.testCrearPersona(IdentidadInt2);
				test1.testCrearPersona(IdentidadInt3);
				test1.testCrearPersona(IdentidadInt4);
				test1.testCrearArtista(Integrantes1);
				test1.testCrearArtista(Integrantes2);
				test1.testCrearArtista(Integrantes3);
				test1.testCrearArtista(Integrantes4);
				test1.testCrearCancion(canciones);
				test1.testCrearCancion(canciones2);
				test1.testCrearAlbum(Album4);

				test1.consultarTodos();
				test1.consultarAlbum();
				
				
			}
			}
			}
		}
	}
