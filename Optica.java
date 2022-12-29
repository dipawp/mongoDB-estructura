import org.bson.Document;
import static com.mongodb.client.model.Filters.eq;
import java.text.SimpleDateFormat;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
public class Optica {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		MongoClient mongo = new MongoClient("127.0.0.1", 27017);
		MongoDatabase db = mongo.getDatabase("optica");
		db.createCollection("proveidor");
		db.createCollection("ullera");
		db.createCollection("comanda");
		loadProveidor(db, "proveidor");
		loadUllera(db, "ullera");
		loadClient(db, "client");
		loadComanda(db, "comanda");
	}
	
	
	public static void loadProveidor(MongoDatabase db,String collection) {
		Document proveidor1 = new Document();
		proveidor1.append("proveidor_id", 1);
		proveidor1.append("nom", "Prosum");
		proveidor1.append("NIF", "5637849B");
		proveidor1.append("telefon", "56987452");
		proveidor1.append("fax", "58745214");
		proveidor1.append("adreça",
				new Document()
				.append("carrer", "carrer dels arbres")
				.append("numero", "1")
				.append("pis", "2")
				.append("ciutat", "Barcelona")
				.append("codi_postal", "08900")
				.append("pais", "España"));
		
		Document proveidor2 = new Document();
		proveidor2.append("proveidor_id", 2);
		proveidor2.append("nom", "Multiópticas");
		proveidor2.append("NIF", "5567855C");
		proveidor2.append("telefon", "65247841");
		proveidor2.append("fax", "69632541");
		proveidor2.append("adreça",
				new Document()
				.append("carrer", "Calle madrid")
				.append("numero", "100")
				.append("pis", "8")
				.append("ciutat", "Madrid")
				.append("codi_postal", "28009")
				.append("pais", "España"));
		
		Document proveidor3 = new Document();
		proveidor3.append("proveidor_id", 3);
		proveidor3.append("nom", "Missandtrendy Sunglasses");
		proveidor3.append("NIF", "56784466T");
		proveidor3.append("telefon", "665874521");
		proveidor3.append("fax", "674521210");
		proveidor3.append("adreça",
				new Document()
				.append("carrer", "Calle bilbao")
				.append("numero", "89")
				.append("pis", "8")
				.append("ciutat", "Bilbao")
				.append("codi_postal", "48005")
				.append("pais", "España"));
		
		
		Document proveidor4 = new Document();
		proveidor4.append("proveidor_id", 4);
		proveidor4.append("nom", "General Óptica");
		proveidor4.append("NIF", "34577655T");
		proveidor4.append("telefon", "67874578");
		proveidor4.append("fax", "67458989");
		proveidor4.append("adreça",
				new Document()
				.append("carrer", "Calle sevilla")
				.append("numero", "3")
				.append("pis", "4")
				.append("ciutat", "Sevilla")
				.append("codi_postal", "41011")
				.append("pais", "España"));
		
		Document proveidor5 = new Document();
		proveidor5.append("proveidor_id", 5);
		proveidor5.append("nom", "VistaÓptica");
		proveidor5.append("NIF", "56722213F");
		proveidor5.append("telefon", "63652145");
		proveidor5.append("fax", "613259652");
		proveidor5.append("adreça",
				new Document()
				.append("carrer", "Calle pamplona")
				.append("numero", "9")
				.append("pis", "7")
				.append("ciutat", "Pamplona")
				.append("codi_postal", "31009")
				.append("pais", "España"));
		
		db.getCollection(collection).insertOne(proveidor1);
		db.getCollection(collection).insertOne(proveidor2);
		db.getCollection(collection).insertOne(proveidor3);
		db.getCollection(collection).insertOne(proveidor4);
		db.getCollection(collection).insertOne(proveidor5);
	}
	
	public static void loadUllera(MongoDatabase db,String collection) {
		Document ullera1 = new Document();
		ullera1.append("ullera_id", 1);
		ullera1.append("marca", "Gucci");
		ullera1.append("graduació",
				new Document()
				.append("E", 2.1)
				.append("D", 2.5));
		ullera1.append("color", "negre");
		ullera1.append("colorVidres",
				new Document()
				.append("E", "transparent")
				.append("D", "neutre"));
		ullera1.append("preu", 256.99);
		ullera1.append("muntura", "metallica");
		ullera1.append("proveidor", db.getCollection("proveidor").find(eq("proveidor_id",1)));
		
		Document ullera2 = new Document();
		ullera2.append("ullera_id", 2);
		ullera2.append("marca", "Armani");
		ullera2.append("graduació",
				new Document()
				.append("E", 1.5)
				.append("D", 1.0));
		ullera2.append("color", "blanc");
		ullera2.append("colorVidres",
				new Document()
				.append("E", "blau")
				.append("D", "blau"));
		ullera2.append("preu", 300.00);
		ullera2.append("muntura", "flotant");
		ullera2.append("proveidor", db.getCollection("proveidor").find(eq("proveidor_id",1)));
		
		Document ullera3 = new Document();
		ullera3.append("ullera_id", 3);
		ullera3.append("marca", "Emporio Armani");
		ullera3.append("graduació",
				new Document()
				.append("E", 0.0)
				.append("D", 0.0));
		ullera3.append("color", "negre");
		ullera3.append("colorVidres",
				new Document()
				.append("E", "marron")
				.append("D", "transparent"));
		ullera3.append("preu", 199.99);
		ullera3.append("muntura", "pasta");
		ullera3.append("proveidor", db.getCollection("proveidor").find(eq("proveidor_id",1)));
		
		Document ullera4 = new Document();
		ullera4.append("ullera_id", 4);
		ullera4.append("marca", "Rayban");
		ullera4.append("graduació",
				new Document()
				.append("E", 1.0)
				.append("D", 1.1));
		ullera4.append("color", "negre");
		ullera4.append("colorVidres",
				new Document()
				.append("E", "negre")
				.append("D", "gris"));
		ullera4.append("preu", 329.99);
		ullera4.append("muntura", "flotant");
		ullera4.append("proveidor", db.getCollection("proveidor").find(eq("proveidor_id",2)));
		
		Document ullera5 = new Document();
		ullera5.append("ullera_id", 5);
		ullera5.append("marca", "Roberto Cavalli");
		ullera5.append("graduació",
				new Document()
				.append("E", 2.5)
				.append("D", 2.0));
		ullera5.append("color", "negre");
		ullera5.append("colorVidres",
				new Document()
				.append("E", "groc")
				.append("D", "verd"));
		ullera5.append("preu", 450.00);
		ullera5.append("muntura", "pasta");
		ullera5.append("proveidor", db.getCollection("proveidor").find(eq("proveidor_id",2)));
		
		Document ullera6 = new Document();
		ullera6.append("ullera_id", 6);
		ullera6.append("marca", "Micael Kors");
		ullera6.append("graduació",
				new Document()
				.append("E", 3.1)
				.append("D", 3.0));
		ullera6.append("color", "negre");
		ullera6.append("colorVidres",
				new Document()
				.append("E", "negre")
				.append("D", "negre"));
		ullera6.append("preu", 750.00);
		ullera6.append("muntura", "pasta");
		ullera6.append("proveidor", db.getCollection("proveidor").find(eq("proveidor_id",1)));
		
		Document ullera7 = new Document();
		ullera7.append("ullera_id", 7);
		ullera7.append("marca", "Guess");
		ullera7.append("graduació",
				new Document()
				.append("E", 0.5)
				.append("D", 0.5));
		ullera7.append("color", "negre");
		ullera7.append("colorVidres",
				new Document()
				.append("E", "negre brillant")
				.append("D", "negre"));
		ullera7.append("preu", 369.99);
		ullera7.append("muntura", "pasta");
		ullera7.append("proveidor", db.getCollection("proveidor").find(eq("proveidor_id",5)));
		
		Document ullera8 = new Document();
		ullera8.append("ullera_id", 8);
		ullera8.append("marca", "Police");
		ullera8.append("graduació",
				new Document()
				.append("E", 0.9)
				.append("D", 0.9));
		ullera8.append("color", "negre");
		ullera8.append("colorVidres",
				new Document()
				.append("E", "vermell")
				.append("D", "transparent"));
		ullera8.append("preu", 169.99);
		ullera8.append("muntura", "metallica");
		ullera8.append("proveidor", db.getCollection("proveidor").find(eq("proveidor_id",4)));
		
		Document ullera9 = new Document();
		ullera9.append("ullera_id", 9);
		ullera9.append("marca", "Polaroid");
		ullera9.append("graduació",
				new Document()
				.append("E", 1.5)
				.append("D", 1.5));
		ullera9.append("color", "negre");
		ullera9.append("colorVidres",
				new Document()
				.append("E", "negre brillant")
				.append("D", "negre"));
		ullera9.append("preu", 969.99);
		ullera9.append("muntura", "pasta");
		ullera9.append("proveidor", db.getCollection("proveidor").find(eq("proveidor_id",2)));
		
		Document ullera10 = new Document();
		ullera10.append("ullera_id", 10);
		ullera10.append("marca", "Lacoste");
		ullera10.append("graduació",
				new Document()
				.append("E", 5.5)
				.append("D", 5.5));
		ullera10.append("color", "negre");
		ullera10.append("colorVidres",
				new Document()
				.append("E", "negre")
				.append("D", "negre"));
		ullera10.append("preu", 719.99);
		ullera10.append("muntura", "pasta");
		ullera10.append("proveidor", db.getCollection("proveidor").find(eq("proveidor_id",2)));
		
		db.getCollection(collection).insertOne(ullera1);
		db.getCollection(collection).insertOne(ullera2);
		db.getCollection(collection).insertOne(ullera3);
		db.getCollection(collection).insertOne(ullera4);
		db.getCollection(collection).insertOne(ullera5);
		db.getCollection(collection).insertOne(ullera6);
		db.getCollection(collection).insertOne(ullera7);
		db.getCollection(collection).insertOne(ullera8);
		db.getCollection(collection).insertOne(ullera9);
		db.getCollection(collection).insertOne(ullera10);
	}
	
	
	public static void loadClient(MongoDatabase db,String Collection) throws Exception {
		Document client1 = new Document();
		client1.append("client_id", 1);
		client1.append("nom", "client1");
		client1.append("adreça_postal", "carrer Balmes 234");
		client1.append("telefon", "658523214");
		client1.append("correu_electronic", "client1@hotmail.com");
		client1.append("data_registre", new SimpleDateFormat("dd-MM-yyyy").parse("01-08-2022"));
		
		Document client2 = new Document();
		client2.append("client_id", 2);
		client2.append("nom", "client2");
		client2.append("adreça_postal", "carrer Augusta 233");
		client2.append("telefon", "66589745");
		client2.append("correu_electronic", "client2@hotmail.com");
		client2.append("data_registre", new SimpleDateFormat("dd-MM-yyyy").parse("29-08-2022"));
		client2.append("referral", 1);
		
		Document client3 = new Document();
		client3.append("client_id", 3);
		client3.append("nom", "client3");
		client3.append("adreça_postal", "carrer marittim 20");
		client3.append("telefon", "56895623");
		client3.append("correu_electronic", "client3@gmail.com");
		client3.append("data_registre", new SimpleDateFormat("dd-MM-yyyy").parse("16-09-2022"));
		
		Document client4 = new Document();
		client4.append("client_id", 4);
		client4.append("nom", "client4");
		client4.append("adreça_postal", "carrer nou 78");
		client4.append("telefon", "669524152");
		client4.append("correu_electronic", "client4@gmail.com");
		client4.append("data_registre", new SimpleDateFormat("dd-MM-yyyy").parse("06-10-2022"));
		client4.append("referral", 2);
		
		Document client5 = new Document();
		client5.append("client_id", 5);
		client5.append("nom", "client5");
		client5.append("adreça_postal", "carrer prim 6");
		client5.append("telefon", "669524152");
		client5.append("correu_electronic", "client5@gmail.com");
		client5.append("data_registre", new SimpleDateFormat("dd-MM-yyyy").parse("20-11-2022"));
		
		db.getCollection(Collection).insertOne(client1);
		db.getCollection(Collection).insertOne(client2);
		db.getCollection(Collection).insertOne(client3);
		db.getCollection(Collection).insertOne(client4);
		db.getCollection(Collection).insertOne(client5);
	
	}
	
	
	public static void loadComanda(MongoDatabase db,String collection) throws Exception {
		Document comanda1 = new Document();
		comanda1.append("client", db.getCollection("client").find(eq("client_id",1)));
		comanda1.append("productes", db.getCollection("ullera").find(eq("ullera_id",1)));
		comanda1.append("empleat", "Pep");
		comanda1.append("data_comanda", new SimpleDateFormat("dd-MM-yyyy").parse("10-08-2022"));
		comanda1.append("proveidor", db.getCollection("proveidor").find(eq("proveidor_id",1)));
		
		Document comanda2 = new Document();
		comanda2.append("client", db.getCollection("client").find(eq("client_id",5)));
		comanda2.append("productes", db.getCollection("ullera").find(eq("ullera_id",5)));
		comanda2.append("empleat", "Jordi");
		comanda2.append("data_comanda", new SimpleDateFormat("dd-MM-yyyy").parse("23-12-2022"));
		comanda2.append("proveidor", db.getCollection("proveidor").find(eq("proveidor_id",1)));
		
		Document comanda3 = new Document();
		comanda3.append("client", db.getCollection("client").find(eq("client_id",2)));
		comanda3.append("productes", db.getCollection("ullera").find(eq("ullera_id",1)));
		comanda3.append("empleat", "Jordi");
		comanda3.append("data_comanda", new SimpleDateFormat("dd-MM-yyyy").parse("23-11-2022"));
		comanda3.append("proveidor", db.getCollection("proveidor").find(eq("proveidor_id",2)));
		
		Document comanda4 = new Document();
		comanda4.append("client", db.getCollection("client").find(eq("client_id",4)));
		comanda4.append("productes", db.getCollection("ullera").find(eq("ullera_id",2)));
		comanda4.append("empleat", "Joan");
		comanda4.append("data_comanda", new SimpleDateFormat("dd-MM-yyyy").parse("22-12-2022"));
		comanda4.append("proveidor", db.getCollection("proveidor").find(eq("proveidor_id",2)));
		
		Document comanda5 = new Document();
		comanda5.append("client", db.getCollection("client").find(eq("client_id",3)));
		comanda5.append("productes", db.getCollection("ullera").find(eq("ullera_id",2)));
		comanda5.append("empleat", "Jordi");
		comanda5.append("data_comanda", new SimpleDateFormat("dd-MM-yyyy").parse("15-12-2022"));
		comanda5.append("proveidor", db.getCollection("proveidor").find(eq("proveidor_id",1)));
		
		Document comanda6 = new Document();
		comanda6.append("client", db.getCollection("client").find(eq("client_id",1)));
		comanda6.append("productes", db.getCollection("ullera").find(eq("ullera_id",10)));
		comanda6.append("empleat", "Artur");
		comanda6.append("data_comanda", new SimpleDateFormat("dd-MM-yyyy").parse("01-11-2022"));
		comanda6.append("proveidor", db.getCollection("proveidor").find(eq("proveidor_id",2)));
		
		db.getCollection(collection).insertOne(comanda1);
		db.getCollection(collection).insertOne(comanda2);
		db.getCollection(collection).insertOne(comanda3);
		db.getCollection(collection).insertOne(comanda4);
		db.getCollection(collection).insertOne(comanda5);
		db.getCollection(collection).insertOne(comanda6);
	}
	

}
