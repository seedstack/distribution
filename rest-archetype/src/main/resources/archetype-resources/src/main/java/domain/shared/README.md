**Value objects that are shared between aggregates are located under this package.**

Example:

    public class Address extends BaseValueObject {
        private final int number;
        private final String street;
        private final String city;
        private final String zipCode;
    
        public vehicleIdentificationNumber(
                int number,
                String street,
                String city,
                String zipCode) {
            this.number = number;
            this.street = street;
            this.city = city;
            this.zipCode = zipCode;
        }
        
        public int number() {
            return number;
        }
        
        public String street(); {
            return street;
        }
        
        public String city() {
            return city;
        }
    
        public String zipCode() {
            return zipCode;
        }
        
        @Override
        public String toString(){
            return String.format("%d %s\n%s %s", number, street, zipCode, city.toUpperCase());
        }
    }

Rules:

* Only value objects can be shared between aggregates, not entities.
* If a value object is used at various locations, place it in this package.

Additional information:

* http://seedstack.org/docs/business/package-layout
* http://seedstack.org/docs/business/manual/value-objects
