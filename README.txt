


* spring + morphia. / morphia factory?
    <dependency>
        <groupId>org.mongodb.morphia</groupId>
        <artifactId>morphia</artifactId>
        <version>0.105</version>
    </dependency>

    -> 그냥 만들면 됨. ㅎㅎㅎ.





* morphia slf4j logging
    <dependency>
    	<groupId>org.mongodb.morphia</groupId>
    	<artifactId>morphia-logging-slf4j</artifactId>
    	<version>0.105</version>
    </dependency>

    -> MorphiaLoggerFactory.register...






* morphia auto-scan?
    <dependency>
        <groupId>org.mongodb.morphia</groupId>
        <artifactId>morphia-entityscanner-plug</artifactId>
        <version>0.105</version>
    </dependency>

    -> 의존성은 따로 필요 없는듯.
    -> morphia.mapPackage("PKG"); 으로 충분.





* morphia validation?
    <dependency>
    	<groupId>org.mongodb.morphia</groupId>
    	<artifactId>morphia-validation</artifactId>
    	<version>0.105</version>
    </dependency>


        <dependency>
            <groupId>org.hibernate</groupId>
            <artifactId>hibernate-validator</artifactId>
            <version>4.3.1.Final</version>
        </dependency>
            --> 요런 jsr303 구현체도 필요함.

        -->         new ValidationExtension(morphia);

    @Email, @NotNull등을 @Entity에 지정해놓으면 자동으로 저장전에 검사.



### EOF
