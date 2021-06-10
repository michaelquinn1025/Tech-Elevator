package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /*
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */

		// ### EXAMPLE:
		int initialNumberOfBirds = 4;
		int birdsThatFlewAway = 1;
		int remainingNumberOfBirds = initialNumberOfBirds - birdsThatFlewAway;

        /*
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */

		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;

        /*
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */

		int numRacoonsPlayWoods = 3;
		int racoonsThatWentHome = 2;
		int howManyRacoonsLeft = numRacoonsPlayWoods - racoonsThatWentHome;
		System.out.println(howManyRacoonsLeft);
		
        /*
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */

		int numOfFlowers = 5;
		int numOfBees = 3;
		int howManyLessBeesThanFlowers = numOfFlowers - numOfBees;
		System.out.println(howManyLessBeesThanFlowers);
		
        /*
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */

		int lonlyPigeon = 1;
		int anotherPigeon = 1;
		int totPigeonsEatingBreadcrumbs = lonlyPigeon + anotherPigeon;
		System.out.println(totPigeonsEatingBreadcrumbs);
		
        /*
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */

		int owlsOnFence = 3;
		int moreOwlsJoin = 2;
		int totalOwlsOnFence = owlsOnFence + moreOwlsJoin;
		System.out.println(totalOwlsOnFence);
		
        /*
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */

		int beaversWorkingHome = 2;
		int swimmingBeavers = 1;
		int howManyBeaversStillWorkingHome = beaversWorkingHome - swimmingBeavers;
		System.out.println(howManyBeaversStillWorkingHome);
		
        /*
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */

		int toucansOnTreeLimb = 2;
		int addionalToucanTree = 1;
		int totalToucansOnTree = toucansOnTreeLimb + addionalToucanTree;
		System.out.println(totalToucansOnTree);
		
        /*
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */

		int squirrelsInTree = 4;
		int nutsSqirrelsHave = 2;
		int howManyMoreSquirrelsThanNuts = squirrelsInTree - nutsSqirrelsHave;
		System.out.println(howManyMoreSquirrelsThanNuts);
		
        /*
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
		
		double quarter = .25; 
		double nickels = .05;
		double dime = .10;
		double totalMoneyFound = quarter + dime + nickels * 2;
		System.out.println(totalMoneyFound);		

        /*
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */

		int mrsBriersMuffins = 18;
		int mrsMacAdamsMuffins = 20;
		int mrsFlannerysMuffins = 17;
		int totalMuffinsFirstGrade= mrsBriersMuffins + mrsMacAdamsMuffins + mrsFlannerysMuffins;
		System.out.println(totalMuffinsFirstGrade);
		
        /*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
		
		double costOfYoyo = .24;
		double costOfWhistle = .14;
		double totalMrsHillSpent = costOfYoyo + costOfWhistle;
		System.out.println(totalMrsHillSpent);

        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
		
		int largeMarshmallows = 8;
		int miniMarshmallows = 10;
		int totalMarshmallowsForKrispeTreats = largeMarshmallows + miniMarshmallows;
		System.out.println(totalMarshmallowsForKrispeTreats);

        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */

		int mrsHiltsHouseInchesSnowFall = 29;
		int bredknockSchoolInchesSnowFall = 17;
		int howManyMoreInchesSnowFallMrsHiltsThanBredknock = mrsHiltsHouseInchesSnowFall - bredknockSchoolInchesSnowFall;
		System.out.println(howManyMoreInchesSnowFallMrsHiltsThanBredknock);
		
        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */

		int mrsHiltMoneyDollars = 10;
		int toyTruckCostDollars = 3;
		int pencilCaseCostDollars = 2;
		int howManyDollarsMrsHiltLeft = mrsHiltMoneyDollars - toyTruckCostDollars - pencilCaseCostDollars;
		System.out.println(howManyDollarsMrsHiltLeft);	
		
        /*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */

		int marblesJoshHad = 16;
		int lostMarbles = 7;
		int marblesJoshHasLeft = marblesJoshHad - lostMarbles;
		System.out.println(marblesJoshHasLeft);
		
        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */

		int seashellsMeganHas = 19;
		int wantedSeashells = 25;
		int seashellsLeftToFind = wantedSeashells - seashellsMeganHas;
		System.out.println(seashellsLeftToFind);
        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */

		int ballonsBradHas = 17;
		int redBallons = 8;
		int numGreenBallons = ballonsBradHas - redBallons;
		System.out.println(numGreenBallons);
		
        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */

		int booksOnShelf = 38;
		int addedBooks = 10;
		int totNumOfBooks =  booksOnShelf + addedBooks;
		System.out.println(totNumOfBooks);
		
        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */

		
		int beeLegs = 6;
		int numOfBeesHere = 8;
		int totNumOfBeeLegs =  beeLegs *  numOfBeesHere;
		System.out.println(totNumOfBeeLegs);
		
        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */

		double iceCreamConeCost = .99;
		double costOfTwoIceCreamCones = iceCreamConeCost * 2;
		System.out.println( costOfTwoIceCreamCones);
		
        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */

		int rocksMrsHiltNeeds = 125;
		int currentRocks= 64;
		int numOfRocksNeeded = rocksMrsHiltNeeds - currentRocks;
		System.out.println(numOfRocksNeeded);
		
        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */

		int mrsHiltsMarbles = 38;
		int numOfMarblesLost = 15;
		int mrsHiltsMarblesLeft = mrsHiltsMarbles - numOfMarblesLost;
		System.out.println(mrsHiltsMarblesLeft);
        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */

		int concertDistanceMiles = 78;
		int drivenMiles = 32;
		int milesLeftToDriveConcert = concertDistanceMiles - drivenMiles;
		System.out.println(milesLeftToDriveConcert);
			
        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */

		int mrsHiltSatShovelTimeMinutes = 90;
		int mrsHillSunShovelTimeMinutes = 45;
		int mrsHillTotalSholveTimeMintues = mrsHiltSatShovelTimeMinutes + mrsHillSunShovelTimeMinutes;
		System.out.println( mrsHillTotalSholveTimeMintues);
		
        /*
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */

		double mrsHiltHotDogs = 6;
		double hotDogPrice = .50;
		double totPriceHiltSpentHotDogs = mrsHiltHotDogs * hotDogPrice;
		System.out.println( totPriceHiltSpentHotDogs);
		
        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */

		double mrsHiltMoneyCents = .50;
		double pencilCost = .07;
		double howManyPencilsHiltCanBuy = mrsHiltMoneyCents / pencilCost;
		System.out.println( howManyPencilsHiltCanBuy);
		
        /*
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */

		int mrsHiltBufferfliesSeen = 33;
		int orangeButterflies = 20;
		int redButterflies = mrsHiltBufferfliesSeen - orangeButterflies;
		System.out.println( redButterflies);
		
        /*
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */

		double kateMoneyPaid = 1.00;
		double kateCandyCost = .54;
		double kateChange = kateMoneyPaid - kateCandyCost;
		System.out.println( kateChange);
		
        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */

		int markCurrentTress = 13;
		int tressAddedToBackYard = 12;
		int markTotalTreesBackYard = markCurrentTress + tressAddedToBackYard;
		System.out.println(markTotalTreesBackYard);
		
        /*
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */

		int dayTilJoySeesGrandma = 2;
		int hoursInDay = 24;
		int hoursTilJoySeesGrandma = dayTilJoySeesGrandma * hoursInDay;
		System.out.println(hoursTilJoySeesGrandma);
			
				
        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */

		int kimsCousins = 4;
		int piecesOfGumGivenEach = 5;
		int totGumKimNeeds = kimsCousins * piecesOfGumGivenEach;
		System.out.println(totGumKimNeeds);
		
        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */

		double moneyDanHasDollars = 3.00;
		double danCostOfCandy = 1.00;
		double danMoneyLeftDollars = moneyDanHasDollars - danCostOfCandy;
		System.out.println(danMoneyLeftDollars);
		
        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */

		int boatsOnLake = 5;
		int peopleOnEachBoat = 3;
		int totPeopleOnBoats = boatsOnLake * peopleOnEachBoat;
		System.out.println(totPeopleOnBoats);
		
        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */

		int legosEllenHas = 380;
		int legosEllenLost = 57;
		int legosEllenHasLeft = legosEllenHas - legosEllenLost;
		System.out.println(legosEllenHasLeft);
		
        /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins
        */
		
		int muffinsArthurBaked = 35;
		int muffinsArthurNeeds = 83;
		int muffinsStillNeeded = muffinsArthurNeeds - muffinsArthurBaked;
		System.out.println(muffinsStillNeeded);
		
        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */

		int crayonsWillyHas = 1400;
		int crayonsLucyHas = 290;
		int howManyMoreCrayonsWillyThanLucy = crayonsWillyHas - crayonsLucyHas;
		System.out.println(howManyMoreCrayonsWillyThanLucy);
		
        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */

		int stickersPerPage = 10;
		int pagesOfStickers = 22;
		int totNumOfStickers = stickersPerPage * pagesOfStickers;
		System.out.println(totNumOfStickers);
		
        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */

		int cupcakesForChildren = 96;
		int numOfChildrenEatingCupcakes = 8;
		int cupcakesEachChildGets = cupcakesForChildren / numOfChildrenEatingCupcakes;
		System.out.println(cupcakesEachChildGets);
		
        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */

		int gingerbreadCookiesMade = 47;
		int ginerbreadCookiesPerJar = 6;
		int gingerbreaadCookiesRemaidner = gingerbreadCookiesMade % ginerbreadCookiesPerJar;
		System.out.println(gingerbreaadCookiesRemaidner);
		
		/*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */

		int croissantsPrepared = 59;
		int neighborsGivenCroissants = 8;
		int croissantsRemaidner = croissantsPrepared % neighborsGivenCroissants;
		System.out.println(croissantsRemaidner);
		
        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */

		int oatmealCookiesBaked = 276;
		int oatmealCookiesFitOnTray = 12;
		int numOfTraysNeeded = oatmealCookiesBaked / oatmealCookiesFitOnTray;
		System.out.println(numOfTraysNeeded);
				
        /*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */

		int pretzelsMade = 480;
		int pretzelServingSize = 12;
		int totNumPretzelServings = pretzelsMade / pretzelServingSize;
		System.out.println(totNumPretzelServings);
		
		/*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */

		int lemonCupcakes = 51;
		int lemonCupcakesPerBox = 3;
		int lemonCupcakeBoxedGiven = lemonCupcakes / lemonCupcakesPerBox;
		System.out.println(lemonCupcakeBoxedGiven);
		
        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */

		int carrotSticksPrepared = 74;
		int numPeopleEatingCarrots = 12;
		int carrotsRemaidmer = carrotSticksPrepared % numPeopleEatingCarrots;
		System.out.println(carrotsRemaidmer);
		
        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */

		int teddyBearsSusieHas = 98;
		int teddyBeatsPerShelf = 7;
		int shelevesFilledWithTeddyBears = teddyBearsSusieHas / teddyBeatsPerShelf;
		System.out.println(shelevesFilledWithTeddyBears);
		
        /*
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */

		int photosMomHas = 480;
		int photosPerAlbums = 20;
		int albumsNeededForPhotos = photosMomHas / photosPerAlbums;
		System.out.println(albumsNeededForPhotos);
		
        /*
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */

		int tradingCardsJoeHas = 94;
		int tradingCardsPerBox = 8;
		int boxesFilled = tradingCardsJoeHas / tradingCardsPerBox;
		int cardsInUnfilledBox = tradingCardsJoeHas % tradingCardsPerBox;
		System.out.println(boxesFilled + cardsInUnfilledBox);
		
		
		
        /*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */

		int booksFatherhas = 210;
		int shelvesForBooks = 10;
		int booksPerShelf = booksFatherhas / shelvesForBooks;
		System.out.println(booksPerShelf);
		
        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */

		int croissantsChristinaBaked = 17;
		int guestsEatingCroissants = 7;
		int numCroissantsGuestsGet = croissantsChristinaBaked / guestsEatingCroissants;
		System.out.println(numCroissantsGuestsGet);
		
        /*
            CHALLENGE PROBLEMS
        */

        /*
        Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
        1.90 hours. How long will it take the two painter working together to paint 5 12 x 14 rooms?
        Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
        Challenge: How many days will it take the pair to paint 623 rooms assuming they work 8 hours a day?.
        */

		
		
        /*
        Create and assign variables to hold your first name, last name, and middle initial. Using concatenation,
        build an additional variable to hold your full name in the order of last name, first name, middle initial. The
        last and first names should be separated by a comma followed by a space, and the middle initial must end
        with a period.
        Example: "Hopper, Grace B."
        */

		String fName = "Michael";
		String mInitial = "J";
		String lName = "Quinn";
		System.out.println(lName + "," + fName + "," + mInitial);
		
		
        /*
        The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
        What percentage of the trip has been completed?
        Hint: The percent completed is the miles already travelled divided by the total miles.
        Challenge: Display as an integer value between 0 and 100 using casts.
        */

		int tripDistanceMiles = 800;
		int milesTraveled = 537;
		int percentTripCompleted = tripDistanceMiles / milesTraveled;
		System.out.println(percentTripCompleted);

	}

}
