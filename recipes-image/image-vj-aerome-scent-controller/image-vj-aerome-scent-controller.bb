include recipes-core/images/rpi-hwup-image.bb

IMAGE_INSTALL += "openssh \
                  vj-aerome-scent-controller \
"

IMAGE_LINGUAS = "en-us"

export IMAGE_BASENAME = "image-vj-aerome-scent-controller"
