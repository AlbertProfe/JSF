package mongodb1;

import org.bson.Document;
import org.bson.types.ObjectId;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class HelloMongoDB {

	public static void main(String[] args) {

		MongoClientURI connectionString = new MongoClientURI(
				"mongodb+srv://home:1234@clustertest.0h8fd.mongodb.net/test");
		MongoClient mongoClient = new MongoClient(connectionString);

		MongoDatabase database = mongoClient.getDatabase("city");
		MongoCollection<Document> collection = database.getCollection("cars");

		System.out.println(collection.countDocuments());

		Document myDoc = collection.find().first();
		System.out.println(myDoc.toJson());

		Document car = new Document("_id", new ObjectId());
		car.append("make", "Toyota").append("price", 1000d).append("designeBy", "Martinelli, Bravo");

		collection.insertOne(car);
		System.out.println(collection.countDocuments());
		
		for (Document cur : collection.find()) {
		    System.out.println(cur.toJson());
		}

	}

}
