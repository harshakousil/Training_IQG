var Dummy = /** @class */ (function () {
    function Dummy(givenName) {
        this.name = givenName;
    }
    Dummy.prototype.getName = function () {
        return this.name;
    };
    Dummy.prototype.displayDetails = function () {
        return ("HI There welcome to TS :" + this.getName());
    };
    return Dummy;
}());
var nameRef = new Dummy("Kousil Lakkapragada");
console.log(nameRef.displayDetails());
