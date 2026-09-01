
      // Greeting customers after signing in.

      function greet(customer_name) {
        console.log(`Hello,${customer_name}, Welcome to Nconcert Website.`)
      }
      greet("Manzi Jackson")


      // Calculating total amount to pay for a certain number of tickets purchased including discounts

      function  priceCalculator(ticketPrice,ticketQuantity) {
        if (ticketQuantity === 1) {
          console.log(ticketPrice*ticketQuantity)
        }else if(ticketQuantity > 1 && ticketQuantity<=5) {
          console.log([ticketPrice*ticketQuantity]-(ticketPrice*ticketQuantity)*0.25)
        }else {
          console.log([ticketPrice*ticketQuantity]-(ticketPrice*ticketQuantity)*0.30)
        }
      }

      priceCalculator(400,6)

      // Storing full-name, email, phone-number, and inquiries from our clients aftering they filled up contact form

      const fullNames = []
      const phoneNumbers=[]
      const emails = []
      const inquiries = []

      function addCustomerName(fullName) {
        fullNames.push(fullName);
        return fullNames;
      }
      console.log(addCustomerName("John" ));

      function addCustomerPhone(phoneNumber) {
        phoneNumbers.push(phoneNumber);
        return phoneNumbers;
      }
      console.log(addCustomerPhone("345-672-4345" ));


      function addCustomerEmail(email) {
        emails.push(email);
        return emails;
        }
        console.log(addCustomerEmail("eric@gmail.com" ))

      function addCustomerInquiry(inquiry) {
        inquiries.push(inquiry);
        return inquiries;
        }
        console.log(addCustomerInquiry("Great Service" ))

        const contactInfo = []
        contactInfo.push(fullNames[0],phoneNumbers[0],emails[0],inquiries[0])
        console.log(contactInfo)

        //Converting certain elements of the list to the uppercase.

        function convertToUpperCase(string) {
          return string.toUpperCase()
        }

        console.log(convertToUpperCase(emails[0]))