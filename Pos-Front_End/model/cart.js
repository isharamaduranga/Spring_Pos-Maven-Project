function cartModel(code ,description,itemPrice,buyQty,total) {
    var code=code;
    var description=description;
    var itemPrice=itemPrice;
    var buyQty=buyQty;
    var total= total;

    this.getCode = function () {
        return code;
    }

    this.getDescription= function () {
        return description;
    }

    this.getItemPrice = function () {
        return itemPrice;
    }

    this.getBuyQty = function () {
        return buyQty;
    }

    this.getTotal = function () {
        return total;
    }


    this.setCode = function (newcode) {
        code=newcode;
    }

    this.setDescription= function (newdescription) {
        description=newdescription;
    }

    this.setItemPrice = function (newitemPrice) {
        itemPrice=newitemPrice;
    }

    this.setBuyQty = function (newbuyQty) {
        buyQty=newbuyQty;
    }

    this.setTotal = function (newtotal) {
        total=newtotal;
    }

}