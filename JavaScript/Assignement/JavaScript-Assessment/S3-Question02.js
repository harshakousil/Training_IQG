function Grade(sub1, sub2, sub3, examination) {

    avg = (sub1 + sub2 + sub3) / 3;

    if(examination=="Final-exam"){

        if(avg>=89)

            return true;

        else

            return false;

    }

    else {

        if(avg>=90)

            return true;

        else

            return false;

    }

}




console.log(Grade(85, 90, 95, "Final-exam"));