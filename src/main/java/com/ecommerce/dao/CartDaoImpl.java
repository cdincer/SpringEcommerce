package com.ecommerce.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.ecommerce.model.Cart;


@Repository
public class CartDaoImpl implements CartDao {

	private Map<String, Cart> listOfCarts;

	public CartDaoImpl() {
		listOfCarts = new HashMap<String, Cart>();
	}

	@Override
	public Cart create(Cart cart) {
		if (listOfCarts.keySet().contains(cart.getCartId())) {
			throw new IllegalArgumentException(
					String.format("Cannot create a cart.A cart with the given id(%) already exists", cart.getCartId()));
		}

		listOfCarts.put(cart.getCartId(), cart);

		return cart;
	}

	@Override
	public Cart read(String cartId) {

		return listOfCarts.get(cartId);
	}

	@Override
	public void update(String cartId, Cart cart) {
		if (!listOfCarts.keySet().contains(cartId))
		{
			throw new IllegalArgumentException(
					String.format("Cannot update a cart.The cart with the given id(%) doesn't exists", cart.getCartId()));
		}
		
		listOfCarts.put(cartId, cart);

	}

	@Override
	public void delete(String cartId) {

		if (!listOfCarts.keySet().contains(cartId))
		{
			throw new IllegalArgumentException(
					String.format("Cannot delete a cart.The cart with the given id(%) doesn't exists",cartId));
		}
		
		listOfCarts.remove(cartId);
		
	}

}
