class MyFirstGroovyProgram {
    static void main(args) {
        println('Hello world...!');
        /*
        Java 5+ style of groovy
        for (String it : new String[] {"Rod", "Carlos", "Chris"})
            if (it.length() < 4)
                System.out.println(it);

        */

        ["Rod", "Carlos", "Chris"].findAll{it.size() < 4}.each{println it}
        def list = [1, 2]
        def map = [cars: 2, boats: 3]
        println list.getClass()
        println map.getClass()

        def list2 = ['foo', 'bar']
        def newList = []

        list2.collect( newList ) {
            it.toUpperCase()
        }
        println newList
    }
}

