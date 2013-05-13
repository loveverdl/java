package shixun.livestreet.service.inter;

import java.util.List;

import shixun.livestreet.db.pojo.Coupon;
import shixun.livestreet.pojo.CouponInfo;

public interface CouponService {

	public Coupon getDetail(int couponId);

	public List<CouponInfo> recommend();

}
