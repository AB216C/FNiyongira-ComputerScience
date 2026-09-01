
import styles from "./products.module.css"
function ProductDetails(props) {

  return (

    <div className={styles.productdetails} >
      <h2>Product Details</h2>
      { props.product.image &&
      <img src={props.product.image} />
      }
      {/* <img src={props.product.image} /> */}
      <h3> {props.product.name} </h3>
      <p>${props.product.price} </p>
      <p>{props.product.description} </p>
    </div>

  )

}

export default ProductDetails