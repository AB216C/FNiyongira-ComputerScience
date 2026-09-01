import ProductDetails from "./ProductItemDetails"
import styles from "./productlist.module.css"
function ProductList (props) {

  return (

    <div className={styles.productlist} >

      <h1>Product List</h1>

      {
        props.ourproducts.map((product,index)=>(
          <div key={index} >
            <ProductDetails product={product} />
          </div>
        ))
      }
    </div>

  )
}

export default ProductList

