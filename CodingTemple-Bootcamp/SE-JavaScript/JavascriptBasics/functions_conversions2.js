

      function convertTokilom(mile) {
        return(mile*1.6)
      }
      function convertTomile(kilom) {
        return(kilom/1.6)
      }

      function convertkmTokm(kilom) {
        return(kilom*1)
      }

      function convertDistance(distance,unit) {
        if (unit=== 'km') {
          const result2=convertTomile(distance)
          return `${result2}mi`

        }else if(unit=== 'mi') {
          const result2 = convertTokilom(distance)
          return `${result2}km`
        }else {
          const result2=convertkmTokm(distance) 
          return `${result2}km`
        }
    }
      console.log(convertDistance(40,'km'))
      console.log(convertDistance(40,'mi'))
      console.log(convertDistance(40))