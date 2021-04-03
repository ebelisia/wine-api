# wine-api
Wine API

This is a wine API using Spring and JPA.

## Methods
Available methods:
| Method | Description |
|---|---|
| `GET` | Returns information of one or more records. |
| `POST` |Used to create a new record. |
| `PUT` | Updates data for a record or changes. |
| `DELETE` | Removes a record from the system. |

## API Rutes

|   Action                                         | Method   | Local Enpoint                                                 
| -----------------------------------------------|----------|---------------------------------------------------                  
|   Returns information of one or more records   |  `GET`   | http://localhost:8080/wines                                         
|   Create a new record                          |  `POST`  | http://localhost:8080/wines                                       
|   Updates data for a record or changes         |  `PUT`   | http://localhost:8080/wines/{{wine_id}}                             
|   Removes a record from the system.            |  `DELETE`  | http://localhost:8080/wines/{{wine_id}}                          

## Body Example

+ Response 200 (application/json)

    + Body
   
            {
                "name": "Santa Ana Classic Merlot",
                "alcoholPercent": 13.0,
                "grape": "Merlot",
                "year": "2020"
            }

## Installation

After configuring your MySQL username and password in the application.properties file, you can start the project using gradle:

```bash
gradle bootRun
```

## Licence
[MIT](https://choosealicense.com/licenses/mit/)
