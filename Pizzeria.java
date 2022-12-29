import org.bson.Document;
import static com.mongodb.client.model.Filters.eq;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
public class Pizzeria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MongoClient mongo = new MongoClient("127.0.0.1", 27017);
		MongoDatabase db = mongo.getDatabase("pizzeria");
		db.createCollection("empleat");
		db.createCollection("botiga");
		db.createCollection("producte");
		db.createCollection("comanda");
		loadEmpleat(db, "empleat");
		loadBotiga(db, "botiga");
		loadProducte(db, "producte");
		try {
			loadComanda(db, "comanda");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void loadEmpleat(MongoDatabase db,String collectionName) {
		Document empleat1 = new Document();
		empleat1.append("empleat_id", 1);
		empleat1.append("nom", "Pep");
		empleat1.append("cognoms", "Blanco Castillo");
		empleat1.append("NIF", "46557841F");
		empleat1.append("telefon", "675545147");
		empleat1.append("rol", "cuiner");
		
		Document empleat2 = new Document();
		empleat2.append("empleat_id", 2);
		empleat2.append("nom", "Jordi");
		empleat2.append("cognoms", "Garcia Romero");
		empleat2.append("NIF", "47584554G");
		empleat2.append("telefon", "689745541");
		empleat2.append("rol", "repartidor");
		
		Document empleat3 = new Document();
		empleat3.append("empleat_id", 3);
		empleat3.append("nom", "Joan");
		empleat3.append("cognoms", "Sanchez Casanova");
		empleat3.append("NIF", "569877451F");
		empleat3.append("telefon", "675879412");
		empleat3.append("rol", "repartidor");
		
		Document empleat4 = new Document();
		empleat4.append("empleat_id", 4);
		empleat4.append("nom", "Marc");
		empleat4.append("cognoms", "Puig Gomez");
		empleat4.append("NIF", "41254784H");
		empleat4.append("telefon", "69852365");
		empleat4.append("rol", "cuiner");
		
		db.getCollection(collectionName).insertOne(empleat1);
		db.getCollection(collectionName).insertOne(empleat2);
		db.getCollection(collectionName).insertOne(empleat3);
		db.getCollection(collectionName).insertOne(empleat4);
	}
	
	
	public static void loadBotiga(MongoDatabase db,String collectionName) {
		Document botiga1 = new Document();
		botiga1.append("botiga_id", 1);
		botiga1.append("adreça", "Carrer dels arbres 1");
		botiga1.append("codi_postal", "08900");
		botiga1.append("localitat", "Barcelona");
		botiga1.append("provincia", "Barcelona");
		
		Document botiga2 = new Document();
		botiga2.append("botiga_id", 2);
		botiga2.append("adreça", "Calle madrid 100");
		botiga2.append("codi_postal", "28009");
		botiga2.append("localitat", "Madrid");
		botiga2.append("provincia", "Madrid");
		
		Document botiga3 = new Document();
		botiga3.append("botiga_id", 3);
		botiga3.append("adreça", "Calle bilbao 89");
		botiga3.append("codi_postal", "48005");
		botiga3.append("localitat", "Bilbao");
		botiga3.append("provincia", "Bibao");
		
		Document botiga4 = new Document();
		botiga4.append("botiga_id", 4);
		botiga4.append("adreça", "Calle sevilla 3");
		botiga4.append("codi_postal", "41011");
		botiga4.append("localitat", "Sevilla");
		botiga4.append("provincia", "Sevilla");
		
		Document botiga5 = new Document();
		botiga5.append("botiga_id", 5);
		botiga5.append("adreça", "Calle pamplona 9");
		botiga5.append("codi_postal", "31009");
		botiga5.append("localitat", "Pamplona");
		botiga5.append("provincia", "Pamplona");
		
		db.getCollection(collectionName).insertOne(botiga1);
		db.getCollection(collectionName).insertOne(botiga2);
		db.getCollection(collectionName).insertOne(botiga3);
		db.getCollection(collectionName).insertOne(botiga4);
		db.getCollection(collectionName).insertOne(botiga5);
	}
	
	
	public static void loadProducte(MongoDatabase db,String collectionName) {
		Document producte1 = new Document();
		producte1.append("producte_id", 1);
		producte1.append("nom", "Big Mac");
		producte1.append("descripció", "La perfección hecha hamburguesa que te hace agua la boca comienza con dos patties de 100% carne y la salsa Big Mac");
		producte1.append("imatge", "bigMac.png");
		producte1.append("preu", 4.99);
		producte1.append("categoria_producte", "hamburgueses");
		
		Document producte2 = new Document();
		producte2.append("producte_id", 2);
		producte2.append("nom", "MacDouble");
		producte2.append("descripció", "La McDouble®, una hamburguesa doble y clásica de McDonald’s, incluye dos patties de 100% pura carne sazonados con una pizca de sal y pimienta");
		producte2.append("imatge", "macDouble.png");
		producte2.append("preu", 5.99);
		producte2.append("categoria_producte", "hamburgueses");
		
		Document producte3 = new Document();
		producte3.append("producte_id", 3);
		producte3.append("nom", "Super Pepperoni");
		producte3.append("descripció", "Salsa de tomate natural, doble de pepperoni y extra de queso mozzarella.");
		producte3.append("imatge", "pepperoni.png");
		producte3.append("preu", 12.99);
		producte3.append("categoria_producte", "pizzes");
		producte3.append("categoria_pizza", "Tomate");
		
		Document producte4 = new Document();
		producte4.append("producte_id", 4);
		producte4.append("nom", "Seis quesos");
		producte4.append("descripció", "Mezcla de seis quesos (provolone, parmesano,romano, fontina, asiago y mozzarella.");
		producte4.append("imatge", "6quesos.png");
		producte4.append("preu", 14.99);
		producte4.append("categoria_producte", "pizzes");
		producte4.append("categoria_pizza", "Blanca");
		
		Document producte5 = new Document();
		producte5.append("producte_id", 5);
		producte5.append("nom", "Coca-Cola");
		producte5.append("descripció", "Coca-Cola Sabor Original botella 500ml y 1L.");
		producte5.append("imatge", "cocaCola.png");
		producte5.append("preu", 2.99);
		producte5.append("categoria_producte", "begudes");
		
		Document producte6 = new Document();
		producte6.append("producte_id", 6);
		producte6.append("nom", "Fanta naranja");
		producte6.append("descripció", "Fanta Naranja botella 500ml y 1L.");
		producte6.append("imatge", "fanta.png");
		producte6.append("preu", 2.99);
		producte6.append("categoria_producte", "begudes");
		
		db.getCollection(collectionName).insertOne(producte1);
		db.getCollection(collectionName).insertOne(producte2);
		db.getCollection(collectionName).insertOne(producte3);
		db.getCollection(collectionName).insertOne(producte4);
		db.getCollection(collectionName).insertOne(producte5);
		db.getCollection(collectionName).insertOne(producte6);
	}
	
	
	
	public static void loadComanda(MongoDatabase db,String collectionName) throws ParseException {
		Document comanda1 = new Document();
		
		//Date date = (Date) new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse("01-10-2022 00:00:00");
		comanda1.append("data_comanda", new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse("01-10-2022 00:00:00"));
		comanda1.append("entrega", "domicili");
		comanda1.append("lliurament", new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse("01-10-2022 21:15:34"));
		comanda1.append("empleat_id", 1);
		comanda1.append("client",
				new Document()
				.append("nom","Marc")
				.append("cognoms", "Casanova Gil")
				.append("adreça", "Calle primera 8")
				.append("codi_postal", "08977")
				.append("localitat", "Sabt Cugat")
				.append("procincia", "Barcelona")
				.append("telefon", "65257845"));
		comanda1.append("botiga_id", 1);
		
		List<Document> listaProductesComanda1 = new ArrayList<Document>();
		listaProductesComanda1.add(db.getCollection("producte").find(eq("producte_id",2)).first());
		listaProductesComanda1.add(db.getCollection("producte").find(eq("producte_id",3)).first());
		comanda1.append("productes", listaProductesComanda1);
		db.getCollection(collectionName).insertOne(comanda1);
		
		Document comanda2 = new Document();
		//Date date = (Date) new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse("01-10-2022 00:00:00");
				comanda2.append("data_comanda", new SimpleDateFormat("dd-MM-yyyy").parse("11-02-2022"));
				comanda2.append("entrega", "recollir");
				comanda2.append("client",
						new Document()
						.append("nom","Jordi")
						.append("cognoms", "Garcia Castillo")
						.append("adreça", "Calle nueva 21")
						.append("codi_postal", "08911")
						.append("localitat", "Badalona")
						.append("procincia", "Barcelona")
						.append("telefon", "65569744"));
				comanda2.append("botiga_id", 1);
				
				List<Document> listaProductesComanda2 = new ArrayList<Document>();
				listaProductesComanda2.add(db.getCollection("producte").find(eq("producte_id",2)).first());
				listaProductesComanda2.add(db.getCollection("producte").find(eq("producte_id",3)).first());
				listaProductesComanda2.add(db.getCollection("producte").find(eq("producte_id",4)).first());
				comanda2.append("productes", listaProductesComanda2);
		db.getCollection(collectionName).insertOne(comanda2);
		
		
		Document comanda3 = new Document();
		//Date date = (Date) new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse("01-10-2022 00:00:00");
				comanda3.append("data_comanda", new SimpleDateFormat("dd-MM-yyyy").parse("11-02-2022"));
				comanda3.append("entrega", "recollir");
				comanda3.append("client",
						new Document()
						.append("nom","Ana")
						.append("cognoms", "Sanchez Paz")
						.append("adreça", "Calle del mar 1")
						.append("codi_postal", "08133")
						.append("localitat", "Barcelona")
						.append("procincia", "Barcelona")
						.append("telefon", "69852321"));
				comanda3.append("botiga_id", 1);
				
				List<Document> listaProductesComanda3 = new ArrayList<Document>();
				listaProductesComanda3.add(db.getCollection("producte").find(eq("producte_id",3)).first());
				comanda3.append("productes", listaProductesComanda3);
		db.getCollection(collectionName).insertOne(comanda3);
		
		
		Document comanda4 = new Document();
		//Date date = (Date) new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse("01-10-2022 00:00:00");
				comanda4.append("data_comanda", new SimpleDateFormat("dd-MM-yyyy").parse("01-01-2022"));
				comanda4.append("entrega", "domicili");
				comanda4.append("lliurament", new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse("01-10-2022 20:12:45"));
				comanda4.append("empleat_id", 2);
				comanda4.append("client",
						new Document()
						.append("nom","Marc")
						.append("cognoms", "Casanova Gil")
						.append("adreça", "Calle primera 8")
						.append("codi_postal", "08977")
						.append("localitat", "Sabt Cugat")
						.append("procincia", "Barcelona")
						.append("telefon", "65257845"));
				comanda4.append("botiga_id", 1);
				
				List<Document> listaProductesComanda4 = new ArrayList<Document>();
				listaProductesComanda4.add(db.getCollection("producte").find(eq("producte_id",5)).first());
				listaProductesComanda4.add(db.getCollection("producte").find(eq("producte_id",5)).first());
				comanda4.append("productes", listaProductesComanda4);
		db.getCollection(collectionName).insertOne(comanda4);
		
		
		Document comanda5 = new Document();
		//Date date = (Date) new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse("01-10-2022 00:00:00");
				comanda5.append("data_comanda", new SimpleDateFormat("dd-MM-yyyy").parse("11-01-2022"));
				comanda5.append("entrega", "docimili");
				comanda5.append("lliurament", new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse("11-01-2022 21:52:45"));
				comanda5.append("empleat_id", 2);
				comanda5.append("client",
						new Document()
						.append("nom","Jordi")
						.append("cognoms", "Garcia Castillo")
						.append("adreça", "Calle nueva 21")
						.append("codi_postal", "08911")
						.append("localitat", "Badalona")
						.append("procincia", "Barcelona")
						.append("telefon", "65569744"));
				comanda5.append("botiga_id", 2);
				
				List<Document> listaProductesComanda5 = new ArrayList<Document>();
				listaProductesComanda5.add(db.getCollection("producte").find(eq("producte_id",4)).first());
				listaProductesComanda5.add(db.getCollection("producte").find(eq("producte_id",5)).first());
				comanda2.append("productes", listaProductesComanda5);
		db.getCollection(collectionName).insertOne(comanda5);
		
		
		
		Document comanda6 = new Document();
		//Date date = (Date) new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse("01-10-2022 00:00:00");
				comanda6.append("data_comanda", new SimpleDateFormat("dd-MM-yyyy").parse("30-03-2022"));
				comanda6.append("entrega", "domicili");
				comanda5.append("lliurament", new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse("30-03-2022 21:00:00"));
				comanda5.append("empleat_id", 2);
				comanda6.append("client",
						new Document()
						.append("nom","Ana")
						.append("cognoms", "Sanchez Paz")
						.append("adreça", "Calle del mar 1")
						.append("codi_postal", "08133")
						.append("localitat", "Barcelona")
						.append("procincia", "Barcelona")
						.append("telefon", "69852321"));
				comanda6.append("botiga_id", 1);
				
				List<Document> listaProductesComanda6 = new ArrayList<Document>();
				listaProductesComanda6.add(db.getCollection("producte").find(eq("producte_id",4)).first());
				listaProductesComanda6.add(db.getCollection("producte").find(eq("producte_id",4)).first());
				listaProductesComanda6.add(db.getCollection("producte").find(eq("producte_id",5)).first());
				comanda6.append("productes", listaProductesComanda6);
		db.getCollection(collectionName).insertOne(comanda6);
		
	}

}
